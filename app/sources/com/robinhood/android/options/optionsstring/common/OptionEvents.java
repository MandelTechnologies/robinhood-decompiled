package com.robinhood.android.options.optionsstring.common;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.common.strings.UiOptionOrders3;
import com.robinhood.models.p320db.OptionEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionEvents.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\t"}, m3636d2 = {"getDetailTitleString", "", "Lcom/robinhood/models/db/OptionEvent$EquityComponent;", "context", "Landroid/content/Context;", "getDetailValueString", "getSharesString", "getStateString", "Lcom/robinhood/models/db/OptionEvent;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.common.OptionEventsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionEvents {

    /* compiled from: OptionEvents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.common.OptionEventsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionEvent.State.values().length];
            try {
                iArr[OptionEvent.State.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionEvent.State.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionEvent.State.QUEUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionEvent.State.VOIDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionEvent.State.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionEvent.State.REVERSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionEvent.State.PREPARING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionEvent.State.DELETED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getDetailTitleString(OptionEvent.EquityComponent equityComponent, Context context) {
        Intrinsics.checkNotNullParameter(equityComponent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = context.getString(C23386R.string.option_event_detail_equity_label, equityComponent.getSymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getDetailValueString(OptionEvent.EquityComponent equityComponent, Context context) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(equityComponent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = context.getString(C23386R.string.option_event_detail_equity_value, UiOptionOrders3.getSideString(resources, equityComponent.getSide()), Integer.valueOf(equityComponent.getQuantity().intValue()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getSharesString(OptionEvent.EquityComponent equityComponent, Context context) {
        Intrinsics.checkNotNullParameter(equityComponent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = context.getString(C23386R.string.option_event_equity_component_title, Formats.getIntegerFormat().format(Integer.valueOf(equityComponent.getQuantity().intValue())), equityComponent.getSymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getStateString(OptionEvent optionEvent, Context context) {
        int i;
        Intrinsics.checkNotNullParameter(optionEvent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        switch (WhenMappings.$EnumSwitchMapping$0[optionEvent.getState().ordinal()]) {
            case 1:
                i = C23386R.string.option_event_state_confirmed;
                break;
            case 2:
            case 3:
                i = C23386R.string.option_event_state_pending;
                break;
            case 4:
                i = C23386R.string.option_event_state_voided;
                break;
            case 5:
                i = C23386R.string.option_event_state_canceled;
                break;
            case 6:
                i = C23386R.string.option_event_state_reversed;
                break;
            case 7:
            case 8:
                throw new UnsupportedOperationException("Not UI appropriate");
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
