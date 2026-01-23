package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.window.PopupProperties;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher4;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DisplayCurrencySwitcher.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5$1$3$1, reason: use source file name */
/* loaded from: classes8.dex */
final class DisplayCurrencySwitcher4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ DisplayCurrencySwitcherDuxo $duxo;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
    final /* synthetic */ List<FormattedDisplayCurrency> $formattedDisplayCurrencies;
    final /* synthetic */ boolean $isDropdownFocusable;
    final /* synthetic */ Function0<Unit> $onDropdownDismissed;
    final /* synthetic */ SnapshotState<Boolean> $performClick$delegate;

    DisplayCurrencySwitcher4(boolean z, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, List<FormattedDisplayCurrency> list, DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, SnapshotState<Boolean> snapshotState2) {
        this.$isDropdownFocusable = z;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
        this.$onDropdownDismissed = function0;
        this.$expanded$delegate = snapshotState;
        this.$formattedDisplayCurrencies = list;
        this.$duxo = displayCurrencySwitcherDuxo;
        this.$performClick$delegate = snapshotState2;
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
            ComposerKt.traceEventStart(1581165713, i, -1, "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DisplayCurrencySwitcher.kt:156)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), DisplayCurrencySwitcher.CurrencySwitcherDropdownTestTag);
        boolean zDisplayCurrencySwitcher$lambda$10 = DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$10(this.$expanded$delegate);
        boolean z = this.$isDropdownFocusable;
        PopupProperties popupProperties = new PopupProperties(z, false, z, false, 10, (DefaultConstructorMarker) null);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$eventLogger) | composer.changed(this.$onDropdownDismissed);
        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
        final EventLogger eventLogger = this.$eventLogger;
        final Function0<Unit> function0 = this.$onDropdownDismissed;
        final SnapshotState<Boolean> snapshotState = this.$expanded$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5$1$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DisplayCurrencySwitcher4.invoke$lambda$1$lambda$0(userInteractionEventDescriptor, eventLogger, function0, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AndroidMenu_androidKt.m5699DropdownMenuIlH_yew(zDisplayCurrencySwitcher$lambda$10, (Function0) objRememberedValue, modifierTestTag, 0L, null, popupProperties, null, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(846140876, true, new C217362(this.$formattedDisplayCurrencies, this.$duxo, this.$onDropdownDismissed, this.$eventDescriptor, this.$eventLogger, this.$performClick$delegate, this.$expanded$delegate), composer, 54), composer, 0, 48, 2008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function0 function0, SnapshotState snapshotState) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.DISMISS, null, null, null, 59, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$11(snapshotState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: DisplayCurrencySwitcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5$1$3$1$2 */
    static final class C217362 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ DisplayCurrencySwitcherDuxo $duxo;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
        final /* synthetic */ List<FormattedDisplayCurrency> $formattedDisplayCurrencies;
        final /* synthetic */ Function0<Unit> $onDropdownDismissed;
        final /* synthetic */ SnapshotState<Boolean> $performClick$delegate;

        C217362(List<FormattedDisplayCurrency> list, DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, Function0<Unit> function0, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
            this.$formattedDisplayCurrencies = list;
            this.$duxo = displayCurrencySwitcherDuxo;
            this.$onDropdownDismissed = function0;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$eventLogger = eventLogger;
            this.$performClick$delegate = snapshotState;
            this.$expanded$delegate = snapshotState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$8$selectCurrencyAndDismiss(DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, FormattedDisplayCurrency formattedDisplayCurrency, Function0<Unit> function0, SnapshotState<Boolean> snapshotState) {
            displayCurrencySwitcherDuxo.setSelectedDisplayCurrency(formattedDisplayCurrency.getCurrency());
            DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$11(snapshotState, false);
            function0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$6$lambda$5(UserInteractionEventDescriptor userInteractionEventDescriptor, int i, List list, EventLogger eventLogger, DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, FormattedDisplayCurrency formattedDisplayCurrency, Function0 function0, SnapshotState snapshotState) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.SELECT, new Context(i, list.size(), 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -1, -1, -1, -1, -1, 16383, null), null, null, 51, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            invoke$lambda$8$selectCurrencyAndDismiss(displayCurrencySwitcherDuxo, formattedDisplayCurrency, function0, snapshotState);
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 DropdownMenu, Composer composer, int i) {
            Object displayCurrencySwitcher5;
            boolean z;
            Boolean bool;
            SnapshotState<Boolean> snapshotState;
            SnapshotState<Boolean> snapshotState2;
            int i2;
            BentoTheme bentoTheme;
            List<FormattedDisplayCurrency> list;
            EventLogger eventLogger;
            DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo;
            FormattedDisplayCurrency formattedDisplayCurrency;
            Function0<Unit> function0;
            SnapshotState<Boolean> snapshotState3;
            float fM21590getDefaultD9Ej5fM;
            float fM21593getSmallD9Ej5fM;
            long jM21371getBg0d7_KjU;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
            if ((i & 17) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(846140876, i, -1, "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DisplayCurrencySwitcher.kt:172)");
            }
            final List<FormattedDisplayCurrency> list2 = this.$formattedDisplayCurrencies;
            DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo2 = this.$duxo;
            final Function0<Unit> function02 = this.$onDropdownDismissed;
            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            EventLogger eventLogger2 = this.$eventLogger;
            SnapshotState<Boolean> snapshotState4 = this.$performClick$delegate;
            SnapshotState<Boolean> snapshotState5 = this.$expanded$delegate;
            Iterator it = list2.iterator();
            int i3 = 0;
            final int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final FormattedDisplayCurrency formattedDisplayCurrency2 = (FormattedDisplayCurrency) next;
                composer2.startReplaceGroup(1392568946);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(i3, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                Iterator it2 = it;
                int i6 = BentoTheme.$stable;
                int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme2.getColors(composer2, i6).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                try {
                    builder.append(formattedDisplayCurrency2.getBolded());
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(formattedDisplayCurrency2.getSecondary());
                        builder.pop(iPushStyle);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                        composer2.endReplaceGroup();
                        Boolean boolValueOf = Boolean.valueOf(DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$13(snapshotState4));
                        composer2.startReplaceGroup(-1224400529);
                        boolean zChanged = composer2.changed(formattedDisplayCurrency2) | composer2.changedInstance(displayCurrencySwitcherDuxo2) | composer2.changed(function02);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            SnapshotState<Boolean> snapshotState6 = snapshotState5;
                            Function0<Unit> function03 = function02;
                            z = true;
                            SnapshotState<Boolean> snapshotState7 = snapshotState4;
                            bool = boolValueOf;
                            displayCurrencySwitcher5 = new DisplayCurrencySwitcher5(formattedDisplayCurrency2, interactionSource3, snapshotState7, displayCurrencySwitcherDuxo2, function03, snapshotState6, null);
                            snapshotState = snapshotState7;
                            function02 = function03;
                            formattedDisplayCurrency2 = formattedDisplayCurrency2;
                            snapshotState2 = snapshotState6;
                            composer2.updateRememberedValue(displayCurrencySwitcher5);
                        } else {
                            snapshotState = snapshotState4;
                            bool = boolValueOf;
                            displayCurrencySwitcher5 = objRememberedValue2;
                            snapshotState2 = snapshotState5;
                            z = true;
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) displayCurrencySwitcher5, composer2, 0);
                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                        final UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.ROW, "fx_switcher_" + formattedDisplayCurrency2.getSymbol(), null, 4, null), null, 47, null);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(false, 0.0f, bentoTheme2.getColors(composer2, i6).m21425getFg0d7_KjU(), 3, null);
                        boolean zIsSelected = formattedDisplayCurrency2.isSelected() ^ true;
                        composer2.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer2.changedInstance(userInteractionEventDescriptorCopy$default) | composer2.changed(i4) | composer2.changedInstance(list2) | composer2.changedInstance(eventLogger2) | composer2.changedInstance(displayCurrencySwitcherDuxo2) | composer2.changed(formattedDisplayCurrency2) | composer2.changed(function02);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                            final DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo3 = displayCurrencySwitcherDuxo2;
                            final SnapshotState<Boolean> snapshotState8 = snapshotState2;
                            final EventLogger eventLogger3 = eventLogger2;
                            i2 = 0;
                            bentoTheme = bentoTheme2;
                            Function0 function04 = new Function0() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5$1$3$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DisplayCurrencySwitcher4.C217362.invoke$lambda$8$lambda$6$lambda$5(userInteractionEventDescriptorCopy$default, i4, list2, eventLogger3, displayCurrencySwitcherDuxo3, formattedDisplayCurrency2, function02, snapshotState8);
                                }
                            };
                            list = list2;
                            eventLogger = eventLogger3;
                            displayCurrencySwitcherDuxo = displayCurrencySwitcherDuxo3;
                            formattedDisplayCurrency = formattedDisplayCurrency2;
                            function0 = function02;
                            snapshotState3 = snapshotState8;
                            composer2.updateRememberedValue(function04);
                            objRememberedValue3 = function04;
                        } else {
                            eventLogger = eventLogger2;
                            list = list2;
                            snapshotState3 = snapshotState2;
                            formattedDisplayCurrency = formattedDisplayCurrency2;
                            function0 = function02;
                            displayCurrencySwitcherDuxo = displayCurrencySwitcherDuxo2;
                            i2 = 0;
                            bentoTheme = bentoTheme2;
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(ClickableKt.m4891clickableO2vRcR0$default(companion2, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, zIsSelected, null, null, (Function0) objRememberedValue3, 24, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                        if (i4 == 0) {
                            composer2.startReplaceGroup(-1483367546);
                            fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1483250428);
                            fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM();
                            composer2.endReplaceGroup();
                        }
                        if (i4 < CollectionsKt.getLastIndex(list)) {
                            composer2.startReplaceGroup(-1483037148);
                            fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1482918170);
                            fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM();
                            composer2.endReplaceGroup();
                        }
                        int i7 = i2;
                        BentoTheme bentoTheme3 = bentoTheme;
                        Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierM5174width3ABfNKs, fM21590getDefaultD9Ej5fM, fM21593getSmallD9Ej5fM, composer2, 0, 0);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, i7);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21622defaultHorizontalPaddingWMci_g0);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        int i8 = i4;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, null, null, composer, 817889280, 0, 15742);
                        Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composer, i7);
                        BentoText2.m20747BentoText38GnDrw(formattedDisplayCurrency.getMeta(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme3.getSpacing(composer, i6).m21593getSmallD9Ej5fM()), composer, 0);
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CHECKMARK_24);
                        String strStringResource = StringResources_androidKt.stringResource(C13997R.string.selected, composer, 0);
                        if (formattedDisplayCurrency.isSelected()) {
                            composer.startReplaceGroup(37454184);
                            jM21371getBg0d7_KjU = bentoTheme3.getColors(composer, i6).m21456getPositive0d7_KjU();
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(37565102);
                            jM21371getBg0d7_KjU = bentoTheme3.getColors(composer, i6).m21371getBg0d7_KjU();
                            composer.endReplaceGroup();
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21371getBg0d7_KjU, null, null, false, composer, BentoIcon4.Size24.$stable, 56);
                        composer.endNode();
                        composer.startReplaceGroup(1392747522);
                        if (i8 < CollectionsKt.getLastIndex(list)) {
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme3.getColors(composer, i6).m21373getBg30d7_KjU(), 0.0f, composer, 6, 4);
                        }
                        composer.endReplaceGroup();
                        composer2 = composer;
                        it = it2;
                        i3 = 0;
                        userInteractionEventDescriptor = userInteractionEventDescriptor2;
                        list2 = list;
                        displayCurrencySwitcherDuxo2 = displayCurrencySwitcherDuxo;
                        function02 = function0;
                        i4 = i5;
                        eventLogger2 = eventLogger;
                        snapshotState4 = snapshotState;
                        snapshotState5 = snapshotState3;
                    } finally {
                    }
                } finally {
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
