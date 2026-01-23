package com.robinhood.android.chart.blackwidowadvancedchart.composables.templates;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEvents;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SelectTemplateBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<TemplateDto> $availableTemplates;
    final /* synthetic */ Context $context;
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ Function0<Unit> $onCreateTemplate;
    final /* synthetic */ Function1<TemplateDto, Unit> $onDeleteTemplate;
    final /* synthetic */ Function1<TemplateDto, Unit> $onRenameTemplate;
    final /* synthetic */ Function1<TemplateDto, Unit> $onSelectTemplate;
    final /* synthetic */ TemplateDto $selectedTemplate;
    final /* synthetic */ SnapshotState<Boolean> $showPopupScrim$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1(ImmutableList<TemplateDto> immutableList, TemplateDto templateDto, Context context, Function1<? super TemplateDto, Unit> function1, Function1<? super TemplateDto, Unit> function12, Function1<? super TemplateDto, Unit> function13, HapticFeedback hapticFeedback, Function0<Unit> function0, SnapshotState<Boolean> snapshotState) {
        this.$availableTemplates = immutableList;
        this.$selectedTemplate = templateDto;
        this.$context = context;
        this.$onDeleteTemplate = function1;
        this.$onRenameTemplate = function12;
        this.$onSelectTemplate = function13;
        this.$hapticFeedback = hapticFeedback;
        this.$onCreateTemplate = function0;
        this.$showPopupScrim$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-46948152, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheet.<anonymous>.<anonymous>.<anonymous> (SelectTemplateBottomSheet.kt:89)");
        }
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$availableTemplates) | composer.changedInstance(this.$selectedTemplate) | composer.changedInstance(this.$context) | composer.changed(this.$onDeleteTemplate) | composer.changed(this.$onRenameTemplate) | composer.changed(this.$onSelectTemplate) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onCreateTemplate);
        final ImmutableList<TemplateDto> immutableList = this.$availableTemplates;
        final TemplateDto templateDto = this.$selectedTemplate;
        final Context context = this.$context;
        final Function1<TemplateDto, Unit> function1 = this.$onDeleteTemplate;
        final Function1<TemplateDto, Unit> function12 = this.$onRenameTemplate;
        final Function1<TemplateDto, Unit> function13 = this.$onSelectTemplate;
        final SnapshotState<Boolean> snapshotState = this.$showPopupScrim$delegate;
        final HapticFeedback hapticFeedback = this.$hapticFeedback;
        final Function0<Unit> function0 = this.$onCreateTemplate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function1 function14 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1.invoke$lambda$6$lambda$5(immutableList, templateDto, context, function1, function12, function13, snapshotState, hapticFeedback, function0, (LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(function14);
            objRememberedValue = function14;
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public static final Unit invoke$lambda$6$lambda$5(ImmutableList immutableList, final TemplateDto templateDto, final Context context, final Function1 function1, final Function1 function12, final Function1 function13, final SnapshotState snapshotState, HapticFeedback hapticFeedback, Function0 function0, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ImmutableList immutableListEmptyList = immutableList;
        if (immutableList == null) {
            immutableListEmptyList = CollectionsKt.emptyList();
        }
        final ImmutableList immutableList2 = immutableListEmptyList;
        final C10893xa047ff1e c10893xa047ff1e = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$invoke$lambda$6$lambda$5$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(TemplateDto templateDto2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((TemplateDto) obj);
            }
        };
        LazyColumn.items(immutableList2.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$invoke$lambda$6$lambda$5$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c10893xa047ff1e.invoke(immutableList2.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$invoke$lambda$6$lambda$5$$inlined$items$default$4
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
                TemplateDto templateDto2 = (TemplateDto) immutableList2.get(i);
                composer.startReplaceGroup(-170042645);
                Modifier modifierAnimateItem$default = LazyItemScope.animateItem$default(lazyItemScope, Modifier.INSTANCE, null, null, null, 7, null);
                boolean zAreEqual = Intrinsics.areEqual(templateDto2, templateDto);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(context) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Context context2 = context;
                    final Function1 function14 = function1;
                    objRememberedValue = new Function1<TemplateDto, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TemplateDto templateDto3) {
                            invoke2(templateDto3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TemplateDto it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            HapticEvents.mediumHapticEvent(context2);
                            function14.invoke(it);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function15 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(context) | composer.changed(function12);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Context context3 = context;
                    final Function1 function16 = function12;
                    objRememberedValue2 = new Function1<TemplateDto, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TemplateDto templateDto3) {
                            invoke2(templateDto3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TemplateDto it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            HapticEvents.mediumHapticEvent(context3);
                            function16.invoke(it);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function17 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer.changedInstance(context) | composer.changed(function13);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    final Context context4 = context;
                    final Function1 function18 = function13;
                    objRememberedValue3 = new Function1<TemplateDto, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$1$1$1$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TemplateDto templateDto3) {
                            invoke2(templateDto3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TemplateDto it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            HapticEvents.mediumHapticEvent(context4);
                            function18.invoke(it);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function1 function19 = (Function1) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance4 = composer.changedInstance(context);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    final Context context5 = context;
                    final SnapshotState snapshotState2 = snapshotState;
                    objRememberedValue4 = new Function0<Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$1$1$1$4$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            HapticEvents.mediumHapticEvent(context5);
                            SelectTemplateBottomSheetKt.SelectTemplateBottomSheet$lambda$2(snapshotState2, !SelectTemplateBottomSheetKt.SelectTemplateBottomSheet$lambda$1(r0));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                TemplateRow.TemplateRow(templateDto2, zAreEqual, function15, function17, function19, (Function0) objRememberedValue4, modifierAnimateItem$default, composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1264685597, true, new C10902xd795970(hapticFeedback, function0)), 3, null);
        return Unit.INSTANCE;
    }
}
