package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: DateInput.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001af\u0010\u0012\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u008e\u0001\u0010%\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u001a\u0010'\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "selectedDateMillis", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "dateInMillis", "", "onDateSelectionChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateInputContent", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "initialDateMillis", "Lkotlin/Function0;", AnnotatedPrivateKey.LABEL, "placeholder", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Landroidx/compose/material3/DateInputValidator;", "dateInputValidator", "Landroidx/compose/material3/internal/DateInputFormat;", "dateInputFormat", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DateInputTextField-tQNruF0", "(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateInputTextField", "Landroidx/compose/foundation/layout/PaddingValues;", "InputTextFieldPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "InputTextNonErroneousBottomPadding", "F", "Landroidx/compose/ui/text/input/TextFieldValue;", "text", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding;
    private static final float InputTextNonErroneousBottomPadding = C2002Dp.m7995constructorimpl(16);

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void DateInputContent(final Long l, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final PrimitiveRanges2 primitiveRanges2, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Composer composer2;
        DateInputFormat dateInputFormat;
        int i3;
        ?? r0;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(643325609);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(calendarModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(primitiveRanges2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(selectableDates) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(datePickerColors) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(643325609, i2, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:60)");
            }
            Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            boolean zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = calendarModel.getDateInputFormat(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) objRememberedValue;
            Strings.Companion companion = Strings.INSTANCE;
            String strM6095getString2EP1pXo = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_input_invalid_for_pattern), composerStartRestartGroup, 0);
            String strM6095getString2EP1pXo2 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_input_invalid_year_range), composerStartRestartGroup, 0);
            String strM6095getString2EP1pXo3 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_input_invalid_not_allowed), composerStartRestartGroup, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(dateInputFormat2) | ((i2 & 57344) == 16384 || ((i2 & 32768) != 0 && composerStartRestartGroup.changed(datePickerFormatter)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                dateInputFormat = dateInputFormat2;
                i3 = i2;
                r0 = 1;
                DateInputValidator dateInputValidator = new DateInputValidator(primitiveRanges2, selectableDates, dateInputFormat, datePickerFormatter, strM6095getString2EP1pXo, strM6095getString2EP1pXo2, strM6095getString2EP1pXo3, "", null, null, 768, null);
                composer2.updateRememberedValue(dateInputValidator);
                objRememberedValue2 = dateInputValidator;
            } else {
                composer2 = composerStartRestartGroup;
                i3 = i2;
                dateInputFormat = dateInputFormat2;
                r0 = 1;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) objRememberedValue2;
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strM6095getString2EP1pXo4 = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_input_label), composer2, 0);
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, r0, null), InputTextFieldPadding);
            int iM5877getSingleDateInputJ2x2o4M = InputIdentifier.INSTANCE.m5877getSingleDateInputJ2x2o4M();
            dateInputValidator2.setCurrentStartDateMillis$material3_release(l);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1819015125, r0, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i4) {
                    if ((i4 & 3) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1819015125, i4, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:87)");
                        }
                        String str = strM6095getString2EP1pXo4;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        boolean zChanged3 = composer4.changed(str) | composer4.changed(upperCase);
                        final String str2 = strM6095getString2EP1pXo4;
                        final String str3 = upperCase;
                        Object objRememberedValue3 = composer4.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2 + ", " + str3);
                                }
                            };
                            composer4.updateRememberedValue(objRememberedValue3);
                        }
                        TextKt.m6028Text4IGK_g(str, SemanticsModifier6.semantics$default(companion2, false, (Function1) objRememberedValue3, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131068);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }, composer2, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-564233108, r0, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i4) {
                    if ((i4 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-564233108, i4, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:92)");
                    }
                    TextKt.m6028Text4IGK_g(upperCase, SemanticsModifier6.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.3.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54);
            int i4 = i3 << 3;
            Composer composer4 = composer2;
            m5815DateInputTextFieldtQNruF0(modifierPadding, l, function1, calendarModel, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, iM5877getSingleDateInputJ2x2o4M, dateInputValidator2, dateInputFormat, localeDefaultLocale, datePickerColors, composer4, (i4 & 112) | 1794054 | (i4 & 896) | (i4 & 7168), (i3 >> 18) & 14);
            composer3 = composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i5) {
                    DateInputKt.DateInputContent(l, function1, calendarModel, primitiveRanges2, datePickerFormatter, selectableDates, datePickerColors, composer5, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* renamed from: DateInputTextField-tQNruF0, reason: not valid java name */
    public static final void m5815DateInputTextFieldtQNruF0(final Modifier modifier, final Long l, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final int i, final DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, final Locale locale, final DatePickerColors datePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        Function1<? super Long, Unit> function12;
        int i5;
        final SnapshotState snapshotState;
        int i6;
        float fM7995constructorimpl;
        Composer composer2;
        final DateInputFormat dateInputFormat2 = dateInputFormat;
        Composer composerStartRestartGroup = composer.startRestartGroup(-857008589);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function12 = function1;
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(calendarModel) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(dateInputValidator) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(dateInputFormat2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(locale) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) != 306783378 || (i5 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857008589, i4, i5, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)");
            }
            SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<SnapshotState<String>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$errorText$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final SnapshotState<String> invoke() {
                    return SnapshotState3.mutableStateOf$default("", null, 2, null);
                }
            }, composerStartRestartGroup, 3072, 6);
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.INSTANCE.getSaver();
            boolean zChangedInstance = ((i4 & 112) == 32) | composerStartRestartGroup.changedInstance(calendarModel);
            int i7 = 234881024 & i4;
            boolean zChangedInstance2 = zChangedInstance | (i7 == 67108864) | composerStartRestartGroup.changedInstance(locale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<SnapshotState<TextFieldValue>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
                    @Override // kotlin.jvm.functions.Function0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final SnapshotState<TextFieldValue> invoke() {
                        String withPattern;
                        Long l2 = l;
                        if (l2 != null) {
                            CalendarModel calendarModel2 = calendarModel;
                            DateInputFormat dateInputFormat3 = dateInputFormat2;
                            withPattern = calendarModel2.formatWithPattern(l2.longValue(), dateInputFormat3.getPatternWithoutDelimiters(), locale);
                            if (withPattern == null) {
                                withPattern = "";
                            }
                        }
                        return SnapshotState3.mutableStateOf$default(new TextFieldValue(withPattern, TextRange2.TextRange(0, 0), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotStateRememberSaveable = RememberSaveable.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 4);
            TextFieldValue textFieldValueDateInputTextField_tQNruF0$lambda$4 = DateInputTextField_tQNruF0$lambda$4(snapshotStateRememberSaveable);
            boolean zChanged = (i7 == 67108864) | composerStartRestartGroup.changed(snapshotStateRememberSaveable) | composerStartRestartGroup.changed(snapshotState2) | ((i4 & 896) == 256) | composerStartRestartGroup.changedInstance(calendarModel) | ((29360128 & i4) == 8388608) | ((3670016 & i4) == 1048576) | composerStartRestartGroup.changedInstance(locale);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                snapshotState = snapshotState2;
                i6 = i4;
                final Function1<? super Long, Unit> function13 = function12;
                Function1<TextFieldValue, Unit> function14 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldValue textFieldValue) {
                        if (textFieldValue.getText().length() <= dateInputFormat2.getPatternWithoutDelimiters().length()) {
                            String text = textFieldValue.getText();
                            for (int i8 = 0; i8 < text.length(); i8++) {
                                if (!Character.isDigit(text.charAt(i8))) {
                                    return;
                                }
                            }
                            snapshotStateRememberSaveable.setValue(textFieldValue);
                            String string2 = StringsKt.trim(textFieldValue.getText()).toString();
                            Long lValueOf = null;
                            if (string2.length() == 0 || string2.length() < dateInputFormat2.getPatternWithoutDelimiters().length()) {
                                snapshotState.setValue("");
                                function13.invoke(null);
                                return;
                            }
                            CalendarDate calendarDate = calendarModel.parse(string2, dateInputFormat2.getPatternWithoutDelimiters());
                            snapshotState.setValue(dateInputValidator.m5816validateXivgLIo(calendarDate, i, locale));
                            Function1<Long, Unit> function15 = function13;
                            if (snapshotState.getValue().length() == 0 && calendarDate != null) {
                                lValueOf = Long.valueOf(calendarDate.getUtcTimeMillis());
                            }
                            function15.invoke(lValueOf);
                        }
                    }
                };
                dateInputFormat2 = dateInputFormat2;
                composerStartRestartGroup.updateRememberedValue(function14);
                objRememberedValue2 = function14;
            } else {
                snapshotState = snapshotState2;
                i6 = i4;
            }
            Function1 function15 = (Function1) objRememberedValue2;
            if (StringsKt.isBlank((CharSequence) snapshotState.getValue())) {
                fM7995constructorimpl = InputTextNonErroneousBottomPadding;
            } else {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, fM7995constructorimpl, 7, null);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        if (StringsKt.isBlank(snapshotState.getValue())) {
                            return;
                        }
                        SemanticsPropertiesKt.error(semanticsPropertyReceiver, snapshotState.getValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            OutlinedTextField.OutlinedTextField(textFieldValueDateInputTextField_tQNruF0$lambda$4, (Function1<? super TextFieldValue, Unit>) function15, SemanticsModifier6.semantics$default(modifierM5146paddingqDBjuR0$default, false, (Function1) objRememberedValue3, 1, null), false, false, (TextStyle) null, function2, function22, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-591991974, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-591991974, i8, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:191)");
                    }
                    if (!StringsKt.isBlank(snapshotState.getValue())) {
                        TextKt.m6028Text4IGK_g(snapshotState.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), !StringsKt.isBlank((CharSequence) snapshotState.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat2), new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.m7781getNumberPjHm6EE(), ImeAction.INSTANCE.m7747getDoneeUduSuo(), null, null, null, 113, null), (KeyboardActions) null, true, 0, 0, (InteractionSource3) null, (Shape) null, datePickerColors.getDateTextFieldColors(), composerStartRestartGroup, (i6 << 6) & 33030144, 12779904, 0, 4001592);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    DateInputKt.m5815DateInputTextFieldtQNruF0(modifier, l, function1, calendarModel, function2, function22, i, dateInputValidator, dateInputFormat2, locale, datePickerColors, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3));
                }
            });
        }
    }

    private static final TextFieldValue DateInputTextField_tQNruF0$lambda$4(SnapshotState<TextFieldValue> snapshotState) {
        return snapshotState.getValue();
    }

    static {
        float f = 24;
        InputTextFieldPadding = PaddingKt.m5139PaddingValuesa9UjIt4$default(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(10), C2002Dp.m7995constructorimpl(f), 0.0f, 8, null);
    }
}
