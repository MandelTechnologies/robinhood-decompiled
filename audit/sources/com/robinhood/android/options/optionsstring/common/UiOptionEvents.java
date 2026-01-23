package com.robinhood.android.options.optionsstring.common;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.FormatAsList2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.common.strings.UiOptionOrders3;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionEvent;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.utils.datetime.format.DayOfWeekFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: UiOptionEvents.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0011\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001a'\u0010\u0014\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012\u001a'\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u0019\u0010\u0016\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\n*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u0017\u001a\u001f\u0010\u001c\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0012\"\u0015\u0010#\u001a\u00020 *\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/models/ui/UiOptionEvent;", "", "isCancelable", "(Lcom/robinhood/models/ui/UiOptionEvent;)Z", "shouldShowContactSupport", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "settleOnOpen", "", "getDetailPageTitle", "(Lcom/robinhood/models/ui/UiOptionEvent;Landroid/content/res/Resources;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Z)Ljava/lang/String;", "Landroid/content/Context;", "context", "j$/time/LocalDate", "availableDate", "getStatusSupplementaryString", "(Lcom/robinhood/models/ui/UiOptionEvent;Landroid/content/Context;Lj$/time/LocalDate;)Ljava/lang/String;", "getExpirationStatusSupplementaryString", "getExerciseStatusSupplementaryString", "getAssignmentStatusSupplementaryString", "getHistoryRowTitle", "(Lcom/robinhood/models/ui/UiOptionEvent;Landroid/content/res/Resources;)Ljava/lang/String;", "getHistoryRowSubtitle", "(Lcom/robinhood/models/ui/UiOptionEvent;)Ljava/lang/String;", "getHistoryRowDetail", "", "computeSharesHeldForExercisesString", "(Ljava/util/List;Landroid/content/res/Resources;)Ljava/lang/String;", "getGenericStatusSupplementaryString", "Lcom/robinhood/models/db/OptionEvent$Type;", "", "getLabelResId", "(Lcom/robinhood/models/db/OptionEvent$Type;)I", "labelResId", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.optionsstring.common.UiOptionEventsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiOptionEvents {

    /* compiled from: UiOptionEvents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.common.UiOptionEventsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[OptionEvent.Type.values().length];
            try {
                iArr[OptionEvent.Type.EXPIRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionEvent.Type.EXERCISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionEvent.Type.ASSIGNMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionEvent.Type.GENERIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionPositionType.values().length];
            try {
                iArr2[OptionPositionType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OptionPositionType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionEvent.State.values().length];
            try {
                iArr3[OptionEvent.State.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[OptionEvent.State.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OptionEvent.State.QUEUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OptionEvent.State.REVERSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OptionEvent.State.PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OptionEvent.State.VOIDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OptionEvent.State.PREPARING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[OptionEvent.State.DELETED.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OptionContractType.values().length];
            try {
                iArr4[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final boolean isCancelable(UiOptionEvent uiOptionEvent) {
        Intrinsics.checkNotNullParameter(uiOptionEvent, "<this>");
        return uiOptionEvent.getOptionEvent().getType() == OptionEvent.Type.EXERCISE && uiOptionEvent.getOptionEvent().getState() == OptionEvent.State.QUEUED;
    }

    public static final boolean shouldShowContactSupport(UiOptionEvent uiOptionEvent) {
        Intrinsics.checkNotNullParameter(uiOptionEvent, "<this>");
        return uiOptionEvent.getOptionEvent().getType() == OptionEvent.Type.EXERCISE && uiOptionEvent.getOptionEvent().getState() == OptionEvent.State.REVERSED;
    }

    public static final String getDetailPageTitle(UiOptionEvent uiOptionEvent, Resources resources, OptionChain.UnderlyingType underlyingType, boolean z) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionEvent, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        String chainSymbol = uiOptionEvent.getOptionInstrument().getChainSymbol();
        String str = OptionUnderlyings.getStrikeFormatter(underlyingType).format(uiOptionEvent.getOptionInstrument().getStrikePrice());
        CharSequence typeString = OptionExtensions.getTypeString(uiOptionEvent.getOptionInstrument(), resources);
        String expirationStringShort = OptionExtensions2.getExpirationStringShort(resources, uiOptionEvent.getOptionInstrument().getExpirationDate(), z);
        String string2 = resources.getString(getLabelResId(uiOptionEvent.getOptionEvent().getType()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(C23386R.string.option_event_detail_title, chainSymbol, str, typeString, expirationStringShort, string2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static final String getStatusSupplementaryString(UiOptionEvent uiOptionEvent, Context context, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(uiOptionEvent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = WhenMappings.$EnumSwitchMapping$0[uiOptionEvent.getOptionEvent().getType().ordinal()];
        if (i == 1) {
            return getExpirationStatusSupplementaryString(uiOptionEvent, context, localDate);
        }
        if (i == 2) {
            return getExerciseStatusSupplementaryString(uiOptionEvent, context, localDate);
        }
        if (i == 3) {
            return getAssignmentStatusSupplementaryString(uiOptionEvent, context, localDate);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return getGenericStatusSupplementaryString(uiOptionEvent, context, localDate);
    }

    private static final String getExpirationStatusSupplementaryString(UiOptionEvent uiOptionEvent, Context context, LocalDate localDate) {
        String string2;
        switch (WhenMappings.$EnumSwitchMapping$2[uiOptionEvent.getOptionEvent().getState().ordinal()]) {
            case 5:
                if (localDate != null) {
                    return context.getString(C23386R.string.option_event_detail_supplementary_expiration_pending, DayOfWeekFormatter.LONG.format((DayOfWeekFormatter) localDate.getDayOfWeek()));
                }
            case 1:
            case 2:
            case 3:
            case 4:
                return null;
            case 6:
                OptionPositionType positionType = uiOptionEvent.getPositionType();
                int i = positionType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[positionType.ordinal()];
                if (i == -1 || i == 1) {
                    return null;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                OptionEvent.EquityComponent equityComponent = (OptionEvent.EquityComponent) CollectionsKt.singleOrNull((List) uiOptionEvent.getOptionEvent().getEquityComponents());
                if (equityComponent != null && (string2 = context.getString(C23386R.string.option_event_detail_supplementary_expiration_voided, equityComponent.getSymbol())) != null) {
                    return string2;
                }
                String string3 = context.getString(C23386R.string.option_event_detail_supplementary_expiration_voided_multiple);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 7:
            case 8:
                throw new UnsupportedOperationException("Not UI appropriate");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final String getExerciseStatusSupplementaryString(UiOptionEvent uiOptionEvent, Context context, LocalDate localDate) {
        OptionEvent.EquityComponent equityComponent;
        switch (WhenMappings.$EnumSwitchMapping$2[uiOptionEvent.getOptionEvent().getState().ordinal()]) {
            case 5:
                if (localDate == null || (equityComponent = (OptionEvent.EquityComponent) CollectionsKt.singleOrNull((List) uiOptionEvent.getOptionEvent().getEquityComponents())) == null) {
                    return null;
                }
                OrderSide side = equityComponent.getSide();
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return context.getString(C23386R.string.option_event_detail_supplementary_exercise_pending, UiOptionOrders3.getSideString(resources, side), equityComponent.getSymbol(), DayOfWeekFormatter.LONG.format((DayOfWeekFormatter) localDate.getDayOfWeek()));
            case 1:
            case 2:
            case 3:
            case 4:
                return null;
            case 6:
                return null;
            case 7:
            case 8:
                throw new UnsupportedOperationException("Not UI appropriate");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final String getAssignmentStatusSupplementaryString(UiOptionEvent uiOptionEvent, Context context, LocalDate localDate) {
        OptionEvent.EquityComponent equityComponent;
        int i;
        switch (WhenMappings.$EnumSwitchMapping$2[uiOptionEvent.getOptionEvent().getState().ordinal()]) {
            case 5:
                if (localDate == null || (equityComponent = (OptionEvent.EquityComponent) CollectionsKt.singleOrNull((List) uiOptionEvent.getOptionEvent().getEquityComponents())) == null) {
                    return null;
                }
                OrderSide side = equityComponent.getSide();
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return context.getString(C23386R.string.option_event_detail_supplementary_assignment_pending, UiOptionOrders3.getSideString(resources, side), equityComponent.getSymbol(), DayOfWeekFormatter.LONG.format((DayOfWeekFormatter) localDate.getDayOfWeek()));
            case 1:
            case 2:
            case 3:
            case 4:
                return null;
            case 6:
                ArrayList arrayList = new ArrayList();
                OptionEvent.CashComponent cashComponent = uiOptionEvent.getOptionEvent().getCashComponent();
                if (cashComponent != null) {
                    arrayList.add(Formats.getPriceFormat().format(cashComponent.getCashAmount()));
                }
                Iterator<OptionEvent.EquityComponent> it = uiOptionEvent.getOptionEvent().getEquityComponents().iterator();
                while (it.hasNext()) {
                    arrayList.add(OptionEvents.getSharesString(it.next(), context));
                }
                Resources resources2 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                String asList = FormatAsList2.formatAsList(arrayList, resources2);
                int i2 = WhenMappings.$EnumSwitchMapping$3[uiOptionEvent.getOptionInstrument().getContractType().ordinal()];
                if (i2 == 1) {
                    i = C23386R.string.option_event_detail_supplementary_assignment_voided_call;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.string.option_event_detail_supplementary_assignment_voided_put;
                }
                return context.getString(i, asList);
            case 7:
            case 8:
                throw new UnsupportedOperationException("Not UI appropriate");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getHistoryRowTitle(UiOptionEvent uiOptionEvent, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionEvent, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String chainSymbol = uiOptionEvent.getOptionInstrument().getChainSymbol();
        String str = OptionUnderlyings.getStrikeFormatter(uiOptionEvent.getUnderlyingType()).format(uiOptionEvent.getOptionInstrument().getStrikePrice());
        CharSequence typeString = OptionExtensions.getTypeString(uiOptionEvent.getOptionInstrument(), resources);
        String string2 = resources.getString(getLabelResId(uiOptionEvent.getOptionEvent().getType()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(C23386R.string.history_row_title_option_event, chainSymbol, str, typeString, string2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static final String getHistoryRowSubtitle(UiOptionEvent uiOptionEvent) {
        Intrinsics.checkNotNullParameter(uiOptionEvent, "<this>");
        return LocalDateFormatter.MEDIUM.format((LocalDateFormatter) uiOptionEvent.getOptionEvent().getEventDate());
    }

    public static final String getHistoryRowDetail(UiOptionEvent uiOptionEvent, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionEvent, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$2[uiOptionEvent.getOptionEvent().getState().ordinal()]) {
            case 1:
            case 3:
            case 5:
                return Formats.getPriceFormat().format(uiOptionEvent.getOptionEvent().getTotalCashAmount());
            case 2:
                String string2 = resources.getString(C23386R.string.option_event_state_canceled);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 4:
                String string3 = resources.getString(C23386R.string.option_event_state_reversed);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 6:
                String string4 = resources.getString(C23386R.string.option_event_state_voided);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 7:
            case 8:
                throw new UnsupportedOperationException("Not UI appropriate");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getLabelResId(OptionEvent.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return C23386R.string.option_event_type_expiration;
        }
        if (i == 2) {
            return C23386R.string.option_event_type_exercise;
        }
        if (i == 3) {
            return C23386R.string.option_event_type_assignment;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return C23386R.string.option_event_type_generic;
    }

    public static final String computeSharesHeldForExercisesString(List<UiOptionEvent> list, Resources resources) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Map<String, BigDecimal> mapComputeSharesHeldForExercises = UiOptionEvent.INSTANCE.computeSharesHeldForExercises(list);
        ArrayList arrayList = new ArrayList(mapComputeSharesHeldForExercises.size());
        for (Map.Entry<String, BigDecimal> entry : mapComputeSharesHeldForExercises.entrySet()) {
            String key = entry.getKey();
            arrayList.add(resources.getString(C23386R.string.option_event_equity_component_title, entry.getValue(), key));
        }
        return FormatAsList2.formatAsList(arrayList, resources);
    }

    private static final String getGenericStatusSupplementaryString(UiOptionEvent uiOptionEvent, Context context, LocalDate localDate) {
        switch (WhenMappings.$EnumSwitchMapping$2[uiOptionEvent.getOptionEvent().getState().ordinal()]) {
            case 5:
                if (localDate != null) {
                    return context.getString(C23386R.string.option_event_detail_supplementary_generic_pending, DayOfWeekFormatter.LONG.format((DayOfWeekFormatter) localDate.getDayOfWeek()));
                }
            case 1:
            case 2:
            case 3:
            case 4:
                return null;
            case 6:
            case 7:
            case 8:
                throw new UnsupportedOperationException("Not UI appropriate");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
