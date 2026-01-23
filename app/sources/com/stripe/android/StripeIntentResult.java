package com.stripe.android;

import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StripeIntentResult.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0014\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00048F¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\f\u0010\u0019¨\u0006\u001c"}, m3636d2 = {"Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/model/StripeIntent;", "T", "Lcom/stripe/android/core/model/StripeModel;", "", "outcomeFromFlow", "<init>", "(I)V", "stripeIntent", "outcome", "determineOutcome", "(Lcom/stripe/android/model/StripeIntent;I)I", "getOutcome", "(Lcom/stripe/android/model/StripeIntent;)I", "", "isRequireActionSuccessState", "(Lcom/stripe/android/model/StripeIntent;)Z", "I", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "intent", "", "getFailureMessage", "()Ljava/lang/String;", "failureMessage", "()I", "getOutcome$annotations", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class StripeIntentResult<T extends StripeIntent> implements StripeModel {
    private final int outcomeFromFlow;

    /* compiled from: StripeIntentResult.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.Canceled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.Status.Processing.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr2[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[StripeIntent.NextActionType.SwishRedirect.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[StripeIntent.NextActionType.DisplayBoletoDetails.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[StripeIntent.NextActionType.DisplayKonbiniDetails.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[StripeIntent.NextActionType.DisplayMultibancoDetails.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public abstract String getFailureMessage();

    public abstract T getIntent();

    public StripeIntentResult(int i) {
        this.outcomeFromFlow = i;
    }

    public final int getOutcome() {
        return determineOutcome(getIntent(), this.outcomeFromFlow);
    }

    private final int determineOutcome(StripeIntent stripeIntent, int outcome) {
        return outcome != 0 ? outcome : getOutcome(stripeIntent);
    }

    private final int getOutcome(StripeIntent stripeIntent) {
        PaymentMethod.Type type2;
        StripeIntent.Status status = stripeIntent.getStatus();
        switch (status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
            case 1:
                if (stripeIntent.getNextActionData() == null) {
                    return 2;
                }
                return isRequireActionSuccessState(getIntent()) ? 1 : 3;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
                PaymentMethod paymentMethod = getIntent().getPaymentMethod();
                return (paymentMethod == null || (type2 = paymentMethod.type) == null || !type2.getHasDelayedSettlement()) ? 0 : 1;
            default:
                return 0;
        }
    }

    private final boolean isRequireActionSuccessState(StripeIntent stripeIntent) {
        StripeIntent.NextActionType nextActionType = stripeIntent.getNextActionType();
        switch (nextActionType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[nextActionType.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return true;
        }
    }
}
