package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.android.api.transfers.DisclosureLocation;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.utils.money.Currencies;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Locality.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u000e\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m3636d2 = {"disclosureLocation", "Lcom/robinhood/android/api/transfers/DisclosureLocation;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getDisclosureLocation", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;)Lcom/robinhood/android/api/transfers/DisclosureLocation;", "localCurrency", "Ljava/util/Currency;", "getLocalCurrency", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;)Ljava/util/Currency;", "getDefaultCurrency", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "getDefaultSourceAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getDefaultSinkAccountType", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.LocalityKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Locality2 {

    /* compiled from: Locality.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.LocalityKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DisclosureLocation getDisclosureLocation(CountryCode.Supported supported) {
        Intrinsics.checkNotNullParameter(supported, "<this>");
        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return DisclosureLocation.UK_REVIEW_TRANSFER;
        }
        if (Intrinsics.areEqual(supported, CountryCode.Supported.Singapore.INSTANCE)) {
            return DisclosureLocation.SG_REVIEW_TRANSFER;
        }
        throw new IllegalStateException(("Unsupported locality: " + supported).toString());
    }

    public static final Currency getLocalCurrency(CountryCode.Supported supported) {
        Intrinsics.checkNotNullParameter(supported, "<this>");
        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return Currencies.GBP;
        }
        if (Intrinsics.areEqual(supported, CountryCode.Supported.Singapore.INSTANCE)) {
            return Currencies.SGD;
        }
        throw new IllegalStateException(("Unsupported locality: " + supported).toString());
    }

    public static final Currency getDefaultCurrency(CountryCode.Supported supported, TransferDirection transferDirection) {
        Intrinsics.checkNotNullParameter(supported, "<this>");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
            if (i == 1) {
                return Currencies.GBP;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Currencies.USD;
        }
        if (Intrinsics.areEqual(supported, CountryCode.Supported.Singapore.INSTANCE)) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
            if (i2 == 1) {
                return Currencies.SGD;
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Currencies.USD;
        }
        throw new IllegalStateException(("Unsupported locality: " + supported).toString());
    }

    public static final ApiTransferAccount.TransferAccountType getDefaultSourceAccountType(CountryCode.Supported supported, TransferDirection transferDirection) {
        Intrinsics.checkNotNullParameter(supported, "<this>");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return ApiTransferAccount.TransferAccountType.RHS;
        }
        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT;
        }
        if (Intrinsics.areEqual(supported, CountryCode.Supported.Singapore.INSTANCE)) {
            return ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT;
        }
        throw new IllegalStateException(("Unsupported locality: " + supported).toString());
    }

    public static final ApiTransferAccount.TransferAccountType getDefaultSinkAccountType(CountryCode.Supported supported, TransferDirection transferDirection) {
        Intrinsics.checkNotNullParameter(supported, "<this>");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
        if (i == 1) {
            return ApiTransferAccount.TransferAccountType.RHS;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT;
        }
        if (Intrinsics.areEqual(supported, CountryCode.Supported.Singapore.INSTANCE)) {
            return ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT;
        }
        throw new IllegalStateException(("Unsupported locality: " + supported).toString());
    }
}
