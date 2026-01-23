package com.robinhood.android.settings.p254ui.notification;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.settings.p254ui.notification.NotificationSettings4Composable9;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NotificationSettings4Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$Toggle$2$3, reason: use source file name */
/* loaded from: classes5.dex */
final class NotificationSettings4Composable9 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow $bottomSheetRow;
    final /* synthetic */ boolean $isNextItemToggle;
    final /* synthetic */ Function1<NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> $onBottomSheetEntryPointRowClick;
    final /* synthetic */ boolean $showBottomSheetRow;
    final /* synthetic */ NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow $snoozeSheetRow;

    /* JADX WARN: Multi-variable type inference failed */
    NotificationSettings4Composable9(boolean z, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow, Function1<? super NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> function1, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow, boolean z2) {
        this.$showBottomSheetRow = z;
        this.$bottomSheetRow = bottomSheetMultipleChoiceRow;
        this.$onBottomSheetEntryPointRowClick = function1;
        this.$snoozeSheetRow = snoozeBottomSheetMultipleChoiceRow;
        this.$isNextItemToggle = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$3$lambda$2$lambda$0(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$3$lambda$2$lambda$1(int i) {
        return -i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        NotificationSettings4Composable notificationSettings4Composable;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(512058468, i, -1, "com.robinhood.android.settings.ui.notification.Toggle.<anonymous>.<anonymous> (NotificationSettings4Composable.kt:418)");
        }
        if (this.$showBottomSheetRow) {
            notificationSettings4Composable = NotificationSettings4Composable.BOTTOM_SHEET_ROW;
        } else {
            notificationSettings4Composable = NotificationSettings4Composable.SNOOZE_BOTTOM_SHEET_ROW;
        }
        NotificationSettings4Composable notificationSettings4Composable2 = notificationSettings4Composable;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$Toggle$2$3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NotificationSettings4Composable9.invoke$lambda$3$lambda$2((AnimatedContentTransitionScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AnimatedContentKt.AnimatedContent(notificationSettings4Composable2, null, (Function1) objRememberedValue, null, "row_content_transition", null, ComposableLambda3.rememberComposableLambda(-424186580, true, new C283892(this.$bottomSheetRow, this.$onBottomSheetEntryPointRowClick, this.$snoozeSheetRow, this.$isNextItemToggle), composer, 54), composer, 1597824, 42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform invoke$lambda$3$lambda$2(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$Toggle$2$3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(NotificationSettings4Composable9.invoke$lambda$3$lambda$2$lambda$0(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$Toggle$2$3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(NotificationSettings4Composable9.invoke$lambda$3$lambda$2$lambda$1(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
    }

    /* compiled from: NotificationSettings4Composable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$Toggle$2$3$2 */
    static final class C283892 implements Function4<AnimatedContentScope, NotificationSettings4Composable, Composer, Integer, Unit> {
        final /* synthetic */ NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow $bottomSheetRow;
        final /* synthetic */ boolean $isNextItemToggle;
        final /* synthetic */ Function1<NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> $onBottomSheetEntryPointRowClick;
        final /* synthetic */ NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow $snoozeSheetRow;

        /* compiled from: NotificationSettings4Composable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$Toggle$2$3$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NotificationSettings4Composable.values().length];
                try {
                    iArr[NotificationSettings4Composable.BOTTOM_SHEET_ROW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NotificationSettings4Composable.SNOOZE_BOTTOM_SHEET_ROW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C283892(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow, Function1<? super NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> function1, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow, boolean z) {
            this.$bottomSheetRow = bottomSheetMultipleChoiceRow;
            this.$onBottomSheetEntryPointRowClick = function1;
            this.$snoozeSheetRow = snoozeBottomSheetMultipleChoiceRow;
            this.$isNextItemToggle = z;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NotificationSettings4Composable notificationSettings4Composable, Composer composer, Integer num) {
            invoke(animatedContentScope, notificationSettings4Composable, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, NotificationSettings4Composable targetState, Composer composer, int i) {
            boolean z;
            Object obj;
            Composer composer2;
            Modifier.Companion companion;
            Modifier.Companion companion2;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-424186580, i, -1, "com.robinhood.android.settings.ui.notification.Toggle.<anonymous>.<anonymous>.<anonymous> (NotificationSettings4Composable.kt:432)");
            }
            final NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow = this.$bottomSheetRow;
            final Function1<NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> function1 = this.$onBottomSheetEntryPointRowClick;
            final NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow = this.$snoozeSheetRow;
            boolean z2 = this.$isNextItemToggle;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i2 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
            if (i2 == 1) {
                z = z2;
                obj = null;
                composer.startReplaceGroup(-2056558890);
                if (bottomSheetMultipleChoiceRow != null) {
                    StringResource selectedValueText = NotificationSettings4Composable2.getSelectedValueText(bottomSheetMultipleChoiceRow);
                    composer.startReplaceGroup(1457683175);
                    String textAsString = selectedValueText == null ? null : StringResources6.getTextAsString(selectedValueText, composer, StringResource.$stable);
                    composer.endReplaceGroup();
                    String str = textAsString == null ? "" : textAsString;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, bottomSheetMultipleChoiceRow.getId(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                    String primaryText = bottomSheetMultipleChoiceRow.getPrimaryText();
                    BentoBaseRowState.Meta.SingleLineAndIcon singleLineAndIcon = new BentoBaseRowState.Meta.SingleLineAndIcon(str, ServerToBentoAssetMapper2.DROPDOWN_16, "", Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), (DefaultConstructorMarker) null);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(bottomSheetMultipleChoiceRow);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$Toggle$2$3$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NotificationSettings4Composable9.C283892.invoke$lambda$4$lambda$1$lambda$0(function1, bottomSheetMultipleChoiceRow);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    composer2 = composer;
                    companion = companion3;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, primaryText, null, null, singleLineAndIcon, null, false, false, false, 0L, (Function0) objRememberedValue, composer2, (BentoBaseRowState.Meta.SingleLineAndIcon.$stable << 15) | 12582912, 0, 1882);
                } else {
                    composer2 = composer;
                    companion = companion3;
                }
                composer2.endReplaceGroup();
            } else {
                if (i2 != 2) {
                    composer.startReplaceGroup(1457678936);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-2054810304);
                if (snoozeBottomSheetMultipleChoiceRow != null) {
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, snoozeBottomSheetMultipleChoiceRow.getId(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                    companion2 = companion3;
                    String primaryText2 = snoozeBottomSheetMultipleChoiceRow.getPrimaryText();
                    StringResource selectedValueText2 = NotificationSettings4Composable2.getSelectedValueText(snoozeBottomSheetMultipleChoiceRow);
                    composer.startReplaceGroup(1457767239);
                    String textAsString2 = selectedValueText2 == null ? null : StringResources6.getTextAsString(selectedValueText2, composer, StringResource.$stable);
                    composer.endReplaceGroup();
                    BentoBaseRowState.Meta.SingleLineAndIcon singleLineAndIcon2 = new BentoBaseRowState.Meta.SingleLineAndIcon(textAsString2 == null ? "" : textAsString2, ServerToBentoAssetMapper2.DROPDOWN_16, "", Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), (DefaultConstructorMarker) null);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer.changed(function1) | composer.changedInstance(snoozeBottomSheetMultipleChoiceRow);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$Toggle$2$3$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NotificationSettings4Composable9.C283892.invoke$lambda$4$lambda$3$lambda$2(function1, snoozeBottomSheetMultipleChoiceRow);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    z = z2;
                    obj = null;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, null, primaryText2, null, null, singleLineAndIcon2, null, false, false, false, 0L, (Function0) objRememberedValue2, composer, (BentoBaseRowState.Meta.SingleLineAndIcon.$stable << 15) | 12582912, 0, 1882);
                } else {
                    z = z2;
                    obj = null;
                    companion2 = companion3;
                }
                composer.endReplaceGroup();
                composer2 = composer;
                companion = companion2;
            }
            Modifier.Companion companion5 = companion;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion5, 0.0f, 1, obj);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, bentoTheme.getColors(composer2, i3).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
            composer2.startReplaceGroup(1457794202);
            if (z) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM()), composer2, 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(Function1 function1, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow) {
            function1.invoke(bottomSheetMultipleChoiceRow);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function1 function1, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow) {
            function1.invoke(snoozeBottomSheetMultipleChoiceRow);
            return Unit.INSTANCE;
        }
    }
}
