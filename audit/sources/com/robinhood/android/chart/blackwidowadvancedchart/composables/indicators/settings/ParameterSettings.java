package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterValue;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterValueDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.InputOptionsDto;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ParameterSettings.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001ah\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¨\u0006\u0015²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u008e\u0002"}, m3636d2 = {"parameterSettings", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "parameters", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "numpadScope", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "showKeyboard", "Lkotlin/Function1;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/SettingsKeyboardState;", "onParameterUpdated", "Lkotlin/Function2;", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "indicator", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "feature-black-widow-advanced-chart_externalDebug", "currentSelection", "Lblack_widow/contracts/mobile_app_chart/proto/v1/InputOptionsDto;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterSettingsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ParameterSettings {
    public static final void parameterSettings(LazyListScope lazyListScope, final List<IndicatorParameterDto> parameters, final BentoNumpadScopeV2 numpadScope, final Function1<? super SettingsKeyboardState, Unit> showKeyboard, final Function2<? super String, ? super IndicatorParameterValue, Unit> onParameterUpdated, final EventLogger eventLogger, final UserInteractionEventDescriptor eventDescriptor, final IndicatorStateDto indicator) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(numpadScope, "numpadScope");
        Intrinsics.checkNotNullParameter(showKeyboard, "showKeyboard");
        Intrinsics.checkNotNullParameter(onParameterUpdated, "onParameterUpdated");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterSettingsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ParameterSettings.parameterSettings$lambda$0((IndicatorParameterDto) obj);
            }
        };
        final ParameterSettingsKt$parameterSettings$$inlined$items$default$1 parameterSettingsKt$parameterSettings$$inlined$items$default$1 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterSettingsKt$parameterSettings$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(IndicatorParameterDto indicatorParameterDto) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((IndicatorParameterDto) obj);
            }
        };
        lazyListScope.items(parameters.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterSettingsKt$parameterSettings$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(parameters.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterSettingsKt$parameterSettings$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return parameterSettingsKt$parameterSettings$$inlined$items$default$1.invoke(parameters.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterSettingsKt$parameterSettings$$inlined$items$default$4
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
                Object next;
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
                final IndicatorParameterDto indicatorParameterDto = (IndicatorParameterDto) parameters.get(i);
                composer.startReplaceGroup(1948035020);
                IndicatorParameterValueDto value = indicatorParameterDto.getValue();
                IndicatorParameterValueDto.ValueDto value2 = value != null ? value.getValue() : null;
                if (value2 instanceof IndicatorParameterValueDto.ValueDto.NumberValue) {
                    composer.startReplaceGroup(1948048225);
                    double value3 = ((IndicatorParameterValueDto.ValueDto.NumberValue) value2).getValue();
                    BentoNumpadScopeV2 bentoNumpadScopeV2 = numpadScope;
                    Function1 function12 = showKeyboard;
                    composer.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changedInstance(indicatorParameterDto) | composer.changedInstance(indicator) | composer.changedInstance(eventDescriptor) | composer.changed(onParameterUpdated);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final EventLogger eventLogger2 = eventLogger;
                        final IndicatorStateDto indicatorStateDto = indicator;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = eventDescriptor;
                        final Function2 function2 = onParameterUpdated;
                        Object obj = new Function1<Double, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterSettingsKt$parameterSettings$2$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Double d) {
                                invoke(d.doubleValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(double d) {
                                EventLogger eventLogger3 = eventLogger2;
                                Component component = new Component(Component.ComponentType.TEXT_FIELD, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null);
                                LegendAdvancedChartsContext.IndicatorSettings indicatorSettings = new LegendAdvancedChartsContext.IndicatorSettings(indicatorParameterDto.getParameter_id_value(), null, String.valueOf(d), null, 10, null);
                                EventLogger.DefaultImpls.logType$default(eventLogger3, null, null, component, null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, indicatorSettings, null, 0.0d, null, null, 31487, null).getContext(), 11, null);
                                function2.invoke(indicatorParameterDto.getParameter_id_value(), new IndicatorParameterValue(null, Double.valueOf(d), null, null, 13, null));
                            }
                        };
                        composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    composer.endReplaceGroup();
                    ParameterNumberRow.ParameterNumberRow(value3, indicatorParameterDto, bentoNumpadScopeV2, function12, (Function1) objRememberedValue, composer, 0);
                    composer.endReplaceGroup();
                } else if (value2 instanceof IndicatorParameterValueDto.ValueDto.BoolValue) {
                    composer.startReplaceGroup(1949117818);
                    boolean value4 = ((IndicatorParameterValueDto.ValueDto.BoolValue) value2).getValue();
                    composer.startReplaceGroup(-1224400529);
                    boolean zChangedInstance2 = composer.changedInstance(eventLogger) | composer.changedInstance(indicatorParameterDto) | composer.changedInstance(indicator) | composer.changedInstance(eventDescriptor) | composer.changed(showKeyboard) | composer.changed(onParameterUpdated);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final EventLogger eventLogger3 = eventLogger;
                        final IndicatorStateDto indicatorStateDto2 = indicator;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor2 = eventDescriptor;
                        final Function1 function13 = showKeyboard;
                        final Function2 function22 = onParameterUpdated;
                        Object obj2 = new Function1<Boolean, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterSettingsKt$parameterSettings$2$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                EventLogger eventLogger4 = eventLogger3;
                                Component component = new Component(Component.ComponentType.DROPDOWN_OPTION, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null);
                                LegendAdvancedChartsContext.IndicatorSettings indicatorSettings = new LegendAdvancedChartsContext.IndicatorSettings(indicatorParameterDto.getParameter_id_value(), null, String.valueOf(z), null, 10, null);
                                EventLogger.DefaultImpls.logTap$default(eventLogger4, null, null, component, null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor2, null, null, null, null, null, null, 0.0d, false, indicatorStateDto2.getId(), null, indicatorSettings, null, 0.0d, null, null, 31487, null).getContext(), false, 43, null);
                                function13.invoke(Closed.INSTANCE);
                                function22.invoke(indicatorParameterDto.getParameter_id_value(), new IndicatorParameterValue(null, null, Boolean.valueOf(z), null, 11, null));
                            }
                        };
                        composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    composer.endReplaceGroup();
                    CheckRow.CheckRow(value4, indicatorParameterDto, (Function1) objRememberedValue2, composer, 0);
                    composer.endReplaceGroup();
                } else if (value2 instanceof IndicatorParameterValueDto.ValueDto.StringValue) {
                    composer.startReplaceGroup(1950219062);
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = extensions2.toImmutableList(indicatorParameterDto.getInput_options());
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    ImmutableList immutableList = (ImmutableList) objRememberedValue3;
                    composer.endReplaceGroup();
                    IndicatorParameterValueDto.ValueDto.StringValue stringValue = (IndicatorParameterValueDto.ValueDto.StringValue) value2;
                    Object value5 = stringValue.getValue();
                    composer.startReplaceGroup(5004770);
                    boolean zChanged = composer.changed(value5);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                        Iterator<T> it = indicatorParameterDto.getInput_options().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            IndicatorParameterValueDto value6 = ((InputOptionsDto) next).getValue();
                            if (Intrinsics.areEqual(value6 != null ? value6.getString_value() : null, stringValue.getValue())) {
                                break;
                            }
                        }
                        objRememberedValue4 = SnapshotState3.mutableStateOf$default(next, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue4;
                    composer.endReplaceGroup();
                    InputOptionsDto inputOptionsDtoParameterSettings$lambda$10$lambda$6 = ParameterSettings.parameterSettings$lambda$10$lambda$6(snapshotState);
                    if (inputOptionsDtoParameterSettings$lambda$10$lambda$6 != null) {
                        Function1 function14 = showKeyboard;
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance3 = composer.changedInstance(eventLogger) | composer.changedInstance(indicatorParameterDto) | composer.changedInstance(indicator) | composer.changedInstance(eventDescriptor) | composer.changed(snapshotState) | composer.changed(onParameterUpdated);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            final EventLogger eventLogger4 = eventLogger;
                            final IndicatorStateDto indicatorStateDto3 = indicator;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor3 = eventDescriptor;
                            final Function2 function23 = onParameterUpdated;
                            Object obj3 = new Function1<InputOptionsDto, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterSettingsKt$parameterSettings$2$3$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(InputOptionsDto inputOptionsDto) {
                                    invoke2(inputOptionsDto);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(InputOptionsDto it2) {
                                    IndicatorParameterValue proto;
                                    Intrinsics.checkNotNullParameter(it2, "it");
                                    EventLogger.DefaultImpls.logTap$default(eventLogger4, null, null, new Component(Component.ComponentType.DROPDOWN_OPTION, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor3, null, null, null, null, null, null, 0.0d, false, indicatorStateDto3.getId(), null, new LegendAdvancedChartsContext.IndicatorSettings(indicatorParameterDto.getParameter_id_value(), null, it2.getLabel(), null, 10, null), null, 0.0d, null, null, 31487, null).getContext(), false, 43, null);
                                    snapshotState.setValue(it2);
                                    IndicatorParameterValueDto value7 = it2.getValue();
                                    if (value7 == null || (proto = value7.toProto()) == null) {
                                        return;
                                    }
                                    function23.invoke(indicatorParameterDto.getParameter_id_value(), proto);
                                }
                            };
                            composer.updateRememberedValue(obj3);
                            objRememberedValue5 = obj3;
                        }
                        composer.endReplaceGroup();
                        ParameterDropDownRow.ParameterDropDownRow(inputOptionsDtoParameterSettings$lambda$10$lambda$6, immutableList, indicatorParameterDto, function14, (Function1) objRememberedValue5, composer, 0);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1951932525);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object parameterSettings$lambda$0(IndicatorParameterDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getParameter_id_value() + it.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputOptionsDto parameterSettings$lambda$10$lambda$6(SnapshotState<InputOptionsDto> snapshotState) {
        return snapshotState.getValue();
    }
}
