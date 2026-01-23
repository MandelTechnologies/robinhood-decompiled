package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash;

import android.content.res.Resources;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.shared.remote.assets.LottieUrl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositExtraCashSplashStateProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, m3636d2 = {"isLoading", "", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDataState;", "dayNightLottieAssets", "Lkotlin/Pair;", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "title", "Landroidx/compose/ui/text/AnnotatedString;", "resources", "Landroid/content/res/Resources;", "description", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashSplashStateProvider2 {

    /* compiled from: RecurringDepositExtraCashSplashStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoldSubscriptionStore.GoldSubscriptionState.values().length];
            try {
                iArr[GoldSubscriptionStore.GoldSubscriptionState.ALREADY_GOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isLoading(RecurringDepositExtraCashSplashDataState recurringDepositExtraCashSplashDataState) {
        Intrinsics.checkNotNullParameter(recurringDepositExtraCashSplashDataState, "<this>");
        if (recurringDepositExtraCashSplashDataState.getGoldSubscriptionState() == null) {
            return true;
        }
        return recurringDepositExtraCashSplashDataState.getGoldSubscriptionState() == GoldSubscriptionStore.GoldSubscriptionState.ALREADY_GOLD && recurringDepositExtraCashSplashDataState.getSweepsInterest() == null;
    }

    public static final Tuples2<LottieUrl, LottieUrl> dayNightLottieAssets(RecurringDepositExtraCashSplashDataState recurringDepositExtraCashSplashDataState) {
        Intrinsics.checkNotNullParameter(recurringDepositExtraCashSplashDataState, "<this>");
        GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState = recurringDepositExtraCashSplashDataState.getGoldSubscriptionState();
        int i = goldSubscriptionState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[goldSubscriptionState.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return Tuples4.m3642to(LottieUrl.TRANSFER_IDLE_CASH_YG_LIGHT, LottieUrl.TRANSFER_IDLE_CASH_YG_DARK);
        }
        return Tuples4.m3642to(LottieUrl.TRANSFER_IDLE_CASH_NG_LIGHT, LottieUrl.TRANSFER_IDLE_CASH_NG_DARK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AnnotatedString title(RecurringDepositExtraCashSplashDataState recurringDepositExtraCashSplashDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(recurringDepositExtraCashSplashDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState = recurringDepositExtraCashSplashDataState.getGoldSubscriptionState();
        int i = goldSubscriptionState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[goldSubscriptionState.ordinal()];
        int i2 = 2;
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (i == -1) {
            return new AnnotatedString("--------", objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
        }
        if (i == 1) {
            String string2 = resources.getString(C30439R.string.recurring_deposit_extra_cash_yg_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new AnnotatedString(string2, objArr4 == true ? 1 : 0, i2, objArr3 == true ? 1 : 0);
        }
        String string3 = resources.getString(C30439R.string.recurring_deposit_extra_cash_ng_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new AnnotatedString(string3, list, i2, objArr5 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AnnotatedString description(RecurringDepositExtraCashSplashDataState recurringDepositExtraCashSplashDataState, Resources resources) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(recurringDepositExtraCashSplashDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (recurringDepositExtraCashSplashDataState.getGoldSubscriptionState() == null) {
            string2 = "----------------\\n\\n\n----------------";
        } else if (recurringDepositExtraCashSplashDataState.getGoldSubscriptionState() == GoldSubscriptionStore.GoldSubscriptionState.ALREADY_GOLD && recurringDepositExtraCashSplashDataState.getSweepsInterest() != null) {
            string2 = resources.getString(C30439R.string.recurring_deposit_extra_cash_yg_description, recurringDepositExtraCashSplashDataState.getSweepsInterest().getGoldInterestRate());
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = resources.getString(C30439R.string.recurring_deposit_extra_cash_ng_description);
            Intrinsics.checkNotNull(string2);
        }
        return new AnnotatedString(string2, null, 2, 0 == true ? 1 : 0);
    }
}
