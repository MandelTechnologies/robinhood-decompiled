package com.robinhood.common.strings;

import android.content.res.Resources;
import com.robinhood.models.p320db.OptionCorporateAction;
import com.robinhood.models.p355ui.UiOptionCorporateAction;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UiOptionCorporateActions.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\n\u0010\f\u001a\u00020\b*\u00020\t\u001a\u0012\u0010\r\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u000e\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b\u001a\u0012\u0010\u0011\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0012"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/models/db/OptionCorporateAction$State;", "getLabelResId", "(Lcom/robinhood/models/db/OptionCorporateAction$State;)I", "Lcom/robinhood/models/db/OptionCorporateAction$Type;", "(Lcom/robinhood/models/db/OptionCorporateAction$Type;)I", "getHistoryRowTitle", "", "Lcom/robinhood/models/ui/UiOptionCorporateAction;", "resources", "Landroid/content/res/Resources;", "getHistoryRowSubtitle", "getHistoryRowDetail", "getTypeString", "Lcom/robinhood/models/db/OptionCorporateAction;", "res", "getStateString", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.common.strings.UiOptionCorporateActionsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class UiOptionCorporateActions {

    /* compiled from: UiOptionCorporateActions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.common.strings.UiOptionCorporateActionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionCorporateAction.State.values().length];
            try {
                iArr[OptionCorporateAction.State.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionCorporateAction.State.HANDLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionCorporateAction.Type.values().length];
            try {
                iArr2[OptionCorporateAction.Type.CASH_DIVIDEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionCorporateAction.Type.STOCK_DIVIDEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OptionCorporateAction.Type.NON_INTEGER_STOCK_SPLIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OptionCorporateAction.Type.REVERSE_STOCK_SPLIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OptionCorporateAction.Type.STANDARD_INTEGER_STOCK_SPLIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OptionCorporateAction.Type.POSITION_CONSOLIDATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OptionCorporateAction.Type.LIQUIDATION_REORGANIZATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OptionCorporateAction.Type.MERGER_REORGANIZATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OptionCorporateAction.Type.RIGHTS_OFFERING.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[OptionCorporateAction.Type.SHAREHOLDER_MEETING.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[OptionCorporateAction.Type.SPINOFF.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[OptionCorporateAction.Type.TENDER_OFFER.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[OptionCorporateAction.Type.WARRANT.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[OptionCorporateAction.Type.SPECIAL_ACTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[OptionCorporateAction.Type.SYMBOL_CONVERSION.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[OptionCorporateAction.Type.CUSIP_NAME.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[OptionCorporateAction.Type.POSITION_CONSOLIDATION_SYMBOL_CONVERSION.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[OptionCorporateAction.Type.CASH_SETTLEMENT.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[OptionCorporateAction.Type.CASH_IN_LIEU_SETTLEMENT.ordinal()] = 19;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[OptionCorporateAction.Type.UNKNOWN.ordinal()] = 20;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getLabelResId(OptionCorporateAction.State state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return C32428R.string.option_corporate_action_state_pending;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C32428R.string.option_corporate_action_state_handled;
    }

    public static final int getLabelResId(OptionCorporateAction.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[type2.ordinal()]) {
            case 1:
                return C32428R.string.option_corporate_action_type_cash_dividend;
            case 2:
                return C32428R.string.option_corporate_action_type_stock_dividend;
            case 3:
                return C32428R.string.option_corporate_action_type_non_integer_stock_split;
            case 4:
                return C32428R.string.option_corporate_action_type_reverse_stock_split;
            case 5:
                return C32428R.string.option_corporate_action_type_standard_integer_stock_split;
            case 6:
                return C32428R.string.option_corporate_action_type_position_consolidation;
            case 7:
                return C32428R.string.option_corporate_action_type_liquidation_reorganization;
            case 8:
                return C32428R.string.option_corporate_action_type_merger_reorganization;
            case 9:
                return C32428R.string.option_corporate_action_type_rights_offering;
            case 10:
                return C32428R.string.option_corporate_action_type_shareholder_meeting;
            case 11:
                return C32428R.string.option_corporate_action_type_spinoff;
            case 12:
                return C32428R.string.option_corporate_action_type_tender_offer;
            case 13:
                return C32428R.string.option_corporate_action_type_warrant;
            case 14:
                return C32428R.string.option_corporate_action_type_special_action;
            case 15:
                return C32428R.string.option_corporate_action_type_symbol_conversion;
            case 16:
                return C32428R.string.option_corporate_action_type_cusip_name;
            case 17:
                return C32428R.string.f5146xd800ed74;
            case 18:
                return C32428R.string.option_corporate_action_type_cash_settlement;
            case 19:
                return C32428R.string.option_corporate_action_type_cash_in_lieu_settlement;
            case 20:
                return C32428R.string.option_corporate_action_type_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getHistoryRowTitle(UiOptionCorporateAction uiOptionCorporateAction, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionCorporateAction, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C32428R.string.option_corporate_action_history_row_title, uiOptionCorporateAction.getOptionCorporateAction().getOldSymbol(), getTypeString(uiOptionCorporateAction.getOptionCorporateAction(), resources));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getHistoryRowSubtitle(UiOptionCorporateAction uiOptionCorporateAction) {
        Intrinsics.checkNotNullParameter(uiOptionCorporateAction, "<this>");
        return LocalDateFormatter.MEDIUM.format((LocalDateFormatter) uiOptionCorporateAction.getOptionCorporateAction().getEffectiveDate());
    }

    public static final String getHistoryRowDetail(UiOptionCorporateAction uiOptionCorporateAction, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionCorporateAction, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(getLabelResId(uiOptionCorporateAction.getOptionCorporateAction().getState()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getTypeString(OptionCorporateAction optionCorporateAction, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionCorporateAction, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(getLabelResId(optionCorporateAction.getType()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getStateString(OptionCorporateAction optionCorporateAction, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionCorporateAction, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(getLabelResId(optionCorporateAction.getState()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
