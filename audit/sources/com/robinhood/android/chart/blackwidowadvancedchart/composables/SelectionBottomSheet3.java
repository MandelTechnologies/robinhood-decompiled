package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SelectionBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001al\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aO\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001af\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0018\u001a\u00028\u00002\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"T", "", "title", "Lkotlin/Function0;", "", "onDismissRequest", "Lkotlinx/collections/immutable/ImmutableList;", "items", "Lkotlin/Function2;", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "Lkotlin/ExtensionFunctionType;", "displayItemRow", "Landroidx/compose/ui/Modifier;", "modifier", "", "verticallyScrollable", "SelectionBottomSheet", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function4;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "onDone", "content", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "SelectionBottomSheetLayout", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;II)V", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "displayItem", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SelectionBottomSheet3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionBottomSheet$lambda$0(String str, Function0 function0, ImmutableList immutableList, Function4 function4, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SelectionBottomSheet(str, (Function0<Unit>) function0, immutableList, function4, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionBottomSheet$lambda$7(String str, Function0 function0, Object obj, Function4 function4, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SelectionBottomSheet(str, (Function0<Unit>) function0, obj, (Function4<? super RhModalBottomSheet5, ? super Object, ? super Composer, ? super Integer, Unit>) function4, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionBottomSheetLayout$lambda$6(boolean z, String str, Function0 function0, Function2 function2, Modifier modifier, Arrangement.Vertical vertical, int i, int i2, Composer composer, int i3) {
        SelectionBottomSheetLayout(z, str, function0, function2, modifier, vertical, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void SelectionBottomSheet(final String title, final Function0<Unit> onDismissRequest, final ImmutableList<? extends T> items, final Function4<? super RhModalBottomSheet5, ? super T, ? super Composer, ? super Integer, Unit> displayItemRow, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(displayItemRow, "displayItemRow");
        Composer composerStartRestartGroup = composer.startRestartGroup(920936886);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(items) : composerStartRestartGroup.changedInstance(items) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(displayItemRow) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(920936886, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet (SelectionBottomSheet.kt:38)");
                    }
                    final Modifier modifier4 = modifier3;
                    final boolean z4 = z2;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1947442101, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt.SelectionBottomSheet.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1947442101, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet.<anonymous> (SelectionBottomSheet.kt:40)");
                            }
                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(2096954322, true, new AnonymousClass1(z4, title, modifier4, items, displayItemRow), composer2, 54), composer2, 1572864, 62);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: SelectionBottomSheet.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt$SelectionBottomSheet$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                            final /* synthetic */ Function4<RhModalBottomSheet5, T, Composer, Integer, Unit> $displayItemRow;
                            final /* synthetic */ ImmutableList<T> $items;
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ String $title;
                            final /* synthetic */ boolean $verticallyScrollable;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(boolean z, String str, Modifier modifier, ImmutableList<? extends T> immutableList, Function4<? super RhModalBottomSheet5, ? super T, ? super Composer, ? super Integer, Unit> function4) {
                                this.$verticallyScrollable = z;
                                this.$title = str;
                                this.$modifier = modifier;
                                this.$items = immutableList;
                                this.$displayItemRow = function4;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                                invoke(rhModalBottomSheet5, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if ((i & 6) == 0) {
                                    i2 = ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2) | i;
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2096954322, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet.<anonymous>.<anonymous> (SelectionBottomSheet.kt:43)");
                                }
                                boolean z = this.$verticallyScrollable;
                                int i3 = i2;
                                String str = this.$title;
                                composer.startReplaceGroup(5004770);
                                boolean z2 = (i3 & 14) == 4 || ((i3 & 8) != 0 && composer.changedInstance(RhModalBottomSheet));
                                Object objRememberedValue = composer.rememberedValue();
                                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt$SelectionBottomSheet$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return SelectionBottomSheet3.C106361.AnonymousClass1.invoke$lambda$1$lambda$0(RhModalBottomSheet);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                final ImmutableList<T> immutableList = this.$items;
                                final Function4<RhModalBottomSheet5, T, Composer, Integer, Unit> function4 = this.$displayItemRow;
                                SelectionBottomSheet3.SelectionBottomSheetLayout(z, str, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-521223440, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt.SelectionBottomSheet.1.1.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i4) {
                                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-521223440, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet.<anonymous>.<anonymous>.<anonymous> (SelectionBottomSheet.kt:51)");
                                        }
                                        List list = immutableList;
                                        Function4<RhModalBottomSheet5, T, Composer, Integer, Unit> function42 = function4;
                                        RhModalBottomSheet5 rhModalBottomSheet5 = RhModalBottomSheet;
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            function42.invoke(rhModalBottomSheet5, it.next(), composer2, Integer.valueOf(RhModalBottomSheet5.$stable));
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), this.$modifier, null, composer, 3072, 32);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SelectionBottomSheet3.SelectionBottomSheet$lambda$0(title, onDismissRequest, items, displayItemRow, modifier2, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z2 = z;
            if ((74899 & i3) != 74898) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Modifier modifier42 = modifier3;
                final boolean z42 = z2;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1947442101, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt.SelectionBottomSheet.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1947442101, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet.<anonymous> (SelectionBottomSheet.kt:40)");
                        }
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(2096954322, true, new AnonymousClass1(z42, title, modifier42, items, displayItemRow), composer2, 54), composer2, 1572864, 62);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: SelectionBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt$SelectionBottomSheet$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                        final /* synthetic */ Function4<RhModalBottomSheet5, T, Composer, Integer, Unit> $displayItemRow;
                        final /* synthetic */ ImmutableList<T> $items;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ String $title;
                        final /* synthetic */ boolean $verticallyScrollable;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(boolean z, String str, Modifier modifier, ImmutableList<? extends T> immutableList, Function4<? super RhModalBottomSheet5, ? super T, ? super Composer, ? super Integer, Unit> function4) {
                            this.$verticallyScrollable = z;
                            this.$title = str;
                            this.$modifier = modifier;
                            this.$items = immutableList;
                            this.$displayItemRow = function4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                            invoke(rhModalBottomSheet5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i & 6) == 0) {
                                i2 = ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2096954322, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet.<anonymous>.<anonymous> (SelectionBottomSheet.kt:43)");
                            }
                            boolean z = this.$verticallyScrollable;
                            int i3 = i2;
                            String str = this.$title;
                            composer.startReplaceGroup(5004770);
                            boolean z2 = (i3 & 14) == 4 || ((i3 & 8) != 0 && composer.changedInstance(RhModalBottomSheet));
                            Object objRememberedValue = composer.rememberedValue();
                            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt$SelectionBottomSheet$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SelectionBottomSheet3.C106361.AnonymousClass1.invoke$lambda$1$lambda$0(RhModalBottomSheet);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            final ImmutableList<? extends T> immutableList = this.$items;
                            final Function4<? super RhModalBottomSheet5, ? super T, ? super Composer, ? super Integer, Unit> function4 = this.$displayItemRow;
                            SelectionBottomSheet3.SelectionBottomSheetLayout(z, str, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-521223440, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt.SelectionBottomSheet.1.1.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i4) {
                                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-521223440, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet.<anonymous>.<anonymous>.<anonymous> (SelectionBottomSheet.kt:51)");
                                    }
                                    List list = immutableList;
                                    Function4<RhModalBottomSheet5, T, Composer, Integer, Unit> function42 = function4;
                                    RhModalBottomSheet5 rhModalBottomSheet5 = RhModalBottomSheet;
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        function42.invoke(rhModalBottomSheet5, it.next(), composer2, Integer.valueOf(RhModalBottomSheet5.$stable));
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), this.$modifier, null, composer, 3072, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z42;
                modifier2 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z2 = z;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectionBottomSheetLayout(final boolean z, final String title, Function0<Unit> onDone, Function2<? super Composer, ? super Integer, Unit> content, Modifier modifier, Arrangement.Vertical vertical, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Arrangement.Vertical vertical2;
        final HapticFeedback hapticFeedback;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Function2<? super Composer, ? super Integer, Unit> function2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Function0<Unit> function0;
        Composer composer2;
        final Arrangement.Vertical vertical3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1914954398);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    i3 |= composerStartRestartGroup.changed(vertical2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function0 = onDone;
                    function2 = content;
                    composer2 = composerStartRestartGroup;
                    vertical3 = vertical2;
                } else {
                    Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    Arrangement.Vertical top = i4 == 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1914954398, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetLayout (SelectionBottomSheet.kt:68)");
                    }
                    hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                    int i6 = i3 >> 12;
                    Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1034515105);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierWeight = column6.weight(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 5, null), 1.0f, false);
                    if (z) {
                        modifierWeight = ScrollKt.verticalScroll$default(modifierWeight, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion.getCenterHorizontally(), composerStartRestartGroup, ((((i6 & 112) | 384) >> 3) & 14) | 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    int i8 = i3;
                    Modifier modifier4 = modifier3;
                    Arrangement.Vertical vertical4 = top;
                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleSmall(), composerStartRestartGroup, (i3 >> 3) & 14, 0, 8190);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    function2 = content;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 9) & 14));
                    composerStartRestartGroup.endNode();
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 7, null);
                    BentoButtons.Type type2 = BentoButtons.Type.Primary;
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | ((i8 & 896) == 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        function0 = onDone;
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SelectionBottomSheet3.SelectionBottomSheetLayout$lambda$5$lambda$4$lambda$3(hapticFeedback, function0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        function0 = onDone;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoButtonKt.m20585BentoButton6BkTXZw((Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default, type2, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), null, false, null, SelectionBottomSheet.INSTANCE.getLambda$344997823$lib_black_widow_advanced_chart_externalDebug(), composer2, 805306752, 472);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    vertical3 = vertical4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0<Unit> function02 = function0;
                    final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SelectionBottomSheet3.SelectionBottomSheetLayout$lambda$6(z, title, function02, function22, modifier5, vertical3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            vertical2 = vertical;
            if ((74899 & i3) == 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                int i62 = i3 >> 12;
                Arrangement.Vertical top22 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top22, companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1034515105);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifierWeight2 = column62.weight(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 5, null), 1.0f, false);
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(top, companion4.getCenterHorizontally(), composerStartRestartGroup, ((((i62 & 112) | 384) >> 3) & 14) | 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        int i82 = i3;
                        Modifier modifier42 = modifier3;
                        Arrangement.Vertical vertical42 = top;
                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleSmall(), composerStartRestartGroup, (i3 >> 3) & 14, 0, 8190);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        function2 = content;
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i82 >> 9) & 14));
                        composerStartRestartGroup.endNode();
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 7, null);
                        BentoButtons.Type type22 = BentoButtons.Type.Primary;
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | ((i82 & 896) == 256);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            function0 = onDone;
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelectionBottomSheet3.SelectionBottomSheetLayout$lambda$5$lambda$4$lambda$3(hapticFeedback, function0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            BentoButtonKt.m20585BentoButton6BkTXZw((Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default2, type22, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, false, null, SelectionBottomSheet.INSTANCE.getLambda$344997823$lib_black_widow_advanced_chart_externalDebug(), composer2, 805306752, 472);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                            vertical3 = vertical42;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        vertical2 = vertical;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionBottomSheetLayout$lambda$5$lambda$4$lambda$3(HapticFeedback hapticFeedback, Function0 function0) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void SelectionBottomSheet(final String title, final Function0<Unit> onDismissRequest, final T t, final Function4<? super RhModalBottomSheet5, ? super T, ? super Composer, ? super Integer, Unit> displayItem, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(displayItem, "displayItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(1221015938);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(t) : composerStartRestartGroup.changedInstance(t) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(displayItem) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1221015938, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet (SelectionBottomSheet.kt:123)");
                    }
                    Modifier modifier4 = modifier3;
                    SelectionBottomSheet(title, onDismissRequest, (ImmutableList) extensions2.persistentListOf(t), (Function4) displayItem, modifier4, z4, composerStartRestartGroup, (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (((i3 >> 6) & 8) << 6) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SelectionBottomSheet3.SelectionBottomSheet$lambda$7(title, onDismissRequest, t, displayItem, modifier2, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z2 = z;
            if ((74899 & i3) != 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier42 = modifier3;
                SelectionBottomSheet(title, onDismissRequest, (ImmutableList) extensions2.persistentListOf(t), (Function4) displayItem, modifier42, z4, composerStartRestartGroup, (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (((i3 >> 6) & 8) << 6) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
                z3 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z2 = z;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
