package com.robinhood.android.optionsexercise;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.api.ApiOptionExerciseChecks;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p355ui.UiOptionInstrument;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseShortPositionUtils.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\u001a2\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001aB\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¨\u0006\u0010"}, m3636d2 = {"getSharesNeededForExercise", "Ljava/math/BigDecimal;", "uiOptionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;", "quantity", "getShortPositionShares", "exerciseChecks", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "equityPosition", "Lcom/robinhood/models/db/Position;", "getShortPositionText", "", "res", "Landroid/content/res/Resources;", "isShortSellingExerciseEnabled", "", "feature-options-exercise_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsexercise.OptionExerciseShortPositionUtilsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionExerciseShortPositionUtils {
    public static final BigDecimal getSharesNeededForExercise(UiOptionInstrument uiOptionInstrument, BigDecimal bigDecimal) {
        OptionUnderlying optionUnderlying;
        Integer quantity;
        OptionInstrument optionInstrument;
        if (((uiOptionInstrument == null || (optionInstrument = uiOptionInstrument.getOptionInstrument()) == null) ? null : optionInstrument.getContractType()) != OptionContractType.PUT || bigDecimal == null || (optionUnderlying = (OptionUnderlying) CollectionsKt.singleOrNull((List) uiOptionInstrument.getUnderlyings())) == null || (quantity = optionUnderlying.getQuantity()) == null) {
            return null;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(quantity.intValue());
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimalValueOf.multiply(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static final BigDecimal getShortPositionShares(UiOptionInstrument uiOptionInstrument, ApiOptionExerciseChecks apiOptionExerciseChecks, BigDecimal bigDecimal, Position position) {
        BigDecimal quantity;
        BigDecimal exercisable_quantity;
        BigDecimal sharesNeededForExercise;
        if (uiOptionInstrument == null || uiOptionInstrument.getOptionInstrument().getContractType() != OptionContractType.PUT || position == null || (quantity = position.getQuantity()) == null || apiOptionExerciseChecks == null || (exercisable_quantity = apiOptionExerciseChecks.getExercisable_quantity()) == null || bigDecimal == null || (sharesNeededForExercise = getSharesNeededForExercise(uiOptionInstrument, bigDecimal)) == null || exercisable_quantity.signum() == 0 || bigDecimal.signum() == 0 || exercisable_quantity.compareTo(bigDecimal) < 0 || quantity.signum() > 0 || sharesNeededForExercise.compareTo(position.getSharesAvailableForExercise()) <= 0) {
            return null;
        }
        return sharesNeededForExercise;
    }

    public static final String getShortPositionText(Resources res, boolean z, UiOptionInstrument uiOptionInstrument, BigDecimal bigDecimal, ApiOptionExerciseChecks apiOptionExerciseChecks, Position position) {
        BigDecimal shortPositionShares;
        Intrinsics.checkNotNullParameter(res, "res");
        if (z && (shortPositionShares = getShortPositionShares(uiOptionInstrument, apiOptionExerciseChecks, bigDecimal, position)) != null) {
            return res.getString(C24704R.string.option_exercise_short_position_subtitle, Formats.getShareQuantityFormat().format(shortPositionShares));
        }
        return null;
    }
}
