package com.robinhood.android.optionsexercise.validation;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: OptionExerciseValidationFailureResolver.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J,\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "", "overrideDayTradeChecks", "", "launchTransfers", "recommendedAmount", "Ljava/math/BigDecimal;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "accountNumber", "", "launchAccountRestrictions", "launchDayTradeOverview", "finish", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface OptionExerciseValidationFailureResolver {
    void finish();

    void launchAccountRestrictions();

    void launchDayTradeOverview(String accountNumber);

    void launchTransfers(BigDecimal recommendedAmount, BrokerageAccountType brokerageAccountType, ApiTransferAccount.TransferAccountType transferAccountType, String accountNumber);

    void overrideDayTradeChecks();

    /* compiled from: OptionExerciseValidationFailureResolver.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void launchTransfers$default(OptionExerciseValidationFailureResolver optionExerciseValidationFailureResolver, BigDecimal bigDecimal, BrokerageAccountType brokerageAccountType, ApiTransferAccount.TransferAccountType transferAccountType, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchTransfers");
            }
            if ((i & 1) != 0) {
                bigDecimal = null;
            }
            optionExerciseValidationFailureResolver.launchTransfers(bigDecimal, brokerageAccountType, transferAccountType, str);
        }
    }
}
