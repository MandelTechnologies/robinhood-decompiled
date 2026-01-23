package com.robinhood.android.mcw.currencyconverter.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.mcw.currencyconverter.C21706R;
import com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheet;
import com.robinhood.android.mcw.currencyconverter.models.ConversionField;
import com.robinhood.android.mcw.currencyconverter.models.DisplayCurrency;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CurrencySwitcherSheet.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"CurrencySwitcherSheet", "", "currencies", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/mcw/currencyconverter/models/DisplayCurrency;", "selectedCurrency", "selectedField", "Lcom/robinhood/android/mcw/currencyconverter/models/ConversionField;", "onCurrencySelected", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/mcw/currencyconverter/models/DisplayCurrency;Lcom/robinhood/android/mcw/currencyconverter/models/ConversionField;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-mcw-currency-converter_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheetKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CurrencySwitcherSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrencySwitcherSheet$lambda$0(ImmutableList immutableList, DisplayCurrency displayCurrency, ConversionField conversionField, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CurrencySwitcherSheet(immutableList, displayCurrency, conversionField, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CurrencySwitcherSheet(final ImmutableList<DisplayCurrency> currencies, final DisplayCurrency selectedCurrency, final ConversionField selectedField, final Function1<? super DisplayCurrency, Unit> onCurrencySelected, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(selectedField, "selectedField");
        Intrinsics.checkNotNullParameter(onCurrencySelected, "onCurrencySelected");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(617776825);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(currencies) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(selectedCurrency) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(selectedField.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCurrencySelected) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(617776825, i3, -1, "com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheet (CurrencySwitcherSheet.kt:34)");
                }
                int i5 = i3 >> 12;
                int i6 = (i5 & 14) | 1572864 | (i5 & 112);
                modifier3 = modifier4;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier3, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1103470784, true, new C217161(selectedField, currencies, selectedCurrency, onCurrencySelected), composerStartRestartGroup, 54), composerStartRestartGroup, i6, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CurrencySwitcherSheet.CurrencySwitcherSheet$lambda$0(currencies, selectedCurrency, selectedField, onCurrencySelected, onDismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = i3 >> 12;
            int i62 = (i52 & 14) | 1572864 | (i52 & 112);
            modifier3 = modifier4;
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier3, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1103470784, true, new C217161(selectedField, currencies, selectedCurrency, onCurrencySelected), composerStartRestartGroup, 54), composerStartRestartGroup, i62, 60);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CurrencySwitcherSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheetKt$CurrencySwitcherSheet$1 */
    static final class C217161 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<DisplayCurrency> $currencies;
        final /* synthetic */ Function1<DisplayCurrency, Unit> $onCurrencySelected;
        final /* synthetic */ DisplayCurrency $selectedCurrency;
        final /* synthetic */ ConversionField $selectedField;

        /* JADX WARN: Multi-variable type inference failed */
        C217161(ConversionField conversionField, ImmutableList<DisplayCurrency> immutableList, DisplayCurrency displayCurrency, Function1<? super DisplayCurrency, Unit> function1) {
            this.$selectedField = conversionField;
            this.$currencies = immutableList;
            this.$selectedCurrency = displayCurrency;
            this.$onCurrencySelected = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            final RhModalBottomSheet5 rhModalBottomSheet5;
            boolean z;
            boolean z2;
            Object objRememberedValue;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1103470784, i2, -1, "com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheet.<anonymous> (CurrencySwitcherSheet.kt:39)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM(), 5, null);
            ConversionField conversionField = this.$selectedField;
            final ImmutableList<DisplayCurrency> immutableList = this.$currencies;
            final DisplayCurrency displayCurrency = this.$selectedCurrency;
            final Function1<DisplayCurrency, Unit> function1 = this.$onCurrencySelected;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21706R.string.currency_switcher_title, new Object[]{conversionField.getLowercaseName()}, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8124);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), composer, 0);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(immutableList) | composer.changed(displayCurrency) | composer.changed(function1);
            if ((i4 & 14) != 4) {
                if ((i4 & 8) != 0) {
                    rhModalBottomSheet5 = RhModalBottomSheet;
                    if (composer.changedInstance(rhModalBottomSheet5)) {
                    }
                    z2 = zChanged | z;
                    objRememberedValue = composer.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheetKt$CurrencySwitcherSheet$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CurrencySwitcherSheet.C217161.invoke$lambda$4$lambda$3$lambda$2(immutableList, displayCurrency, function1, rhModalBottomSheet5, (LazyListScope) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 511);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                rhModalBottomSheet5 = RhModalBottomSheet;
                z = false;
                z2 = zChanged | z;
                objRememberedValue = composer.rememberedValue();
                if (z2) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheetKt$CurrencySwitcherSheet$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CurrencySwitcherSheet.C217161.invoke$lambda$4$lambda$3$lambda$2(immutableList, displayCurrency, function1, rhModalBottomSheet5, (LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 511);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                rhModalBottomSheet5 = RhModalBottomSheet;
            }
            z = true;
            z2 = zChanged | z;
            objRememberedValue = composer.rememberedValue();
            if (z2) {
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 511);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(final ImmutableList immutableList, final DisplayCurrency displayCurrency, final Function1 function1, final RhModalBottomSheet5 rhModalBottomSheet5, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final C21712xcc64a107 c21712xcc64a107 = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheetKt$CurrencySwitcherSheet$1$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(DisplayCurrency displayCurrency2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((DisplayCurrency) obj);
                }
            };
            LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheetKt$CurrencySwitcherSheet$1$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c21712xcc64a107.invoke(immutableList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheetKt$CurrencySwitcherSheet$1$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$4
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
                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    final DisplayCurrency displayCurrency2 = (DisplayCurrency) immutableList.get(i);
                    composer.startReplaceGroup(912584850);
                    BentoBaseRowState.Start.FlagIcon flagIcon = new BentoBaseRowState.Start.FlagIcon(displayCurrency2.getCurrency().getFlagAssetName());
                    String balance = displayCurrency2.getBalance();
                    BentoBaseRowState.Meta.Icon icon = Intrinsics.areEqual(displayCurrency, displayCurrency2) ? new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.CHECKMARK_24, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null) : null;
                    composer.startReplaceGroup(-1746271574);
                    boolean zChanged = composer.changed(function1) | composer.changed(displayCurrency2) | composer.changedInstance(rhModalBottomSheet5);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = function1;
                        final RhModalBottomSheet5 rhModalBottomSheet52 = rhModalBottomSheet5;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheetKt$CurrencySwitcherSheet$1$1$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(displayCurrency2);
                                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet52, null, 1, null);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, flagIcon, balance, null, null, icon, null, false, false, false, 0L, (Function0) objRememberedValue, composer, (BentoBaseRowState.Start.FlagIcon.$stable << 3) | (BentoBaseRowState.Meta.Icon.$stable << 15), 0, 2009);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }
}
