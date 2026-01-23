package com.robinhood.android.acatsin.partials.adapter;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.adapter.BuildPartialItem;
import com.robinhood.android.acatsin.util.PositionAmountFormatting;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.util.Money;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowExtensions.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¨\u0006\u0017"}, m3636d2 = {"bindHeader", "", "Lcom/robinhood/android/designsystem/row/RdsHeaderRowView;", "header", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$Header;", "bindAddAsset", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "addAsset", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$AddAsset;", "bindAsset", "asset", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$Asset;", "editable", "", "bindCashAsset", "cashAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "bindEquityAsset", "equityAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "bindOptionAsset", "optionAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "lib-acats-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.partials.adapter.RowExtensionsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class RowExtensions {

    /* compiled from: RowExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.partials.adapter.RowExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[UiAcatsAsset.CashAsset.CashType.values().length];
            try {
                iArr[UiAcatsAsset.CashAsset.CashType.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiAcatsAsset.CashAsset.CashType.MARGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionContractType.values().length];
            try {
                iArr2[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiAcatsTransfer.Asset.Direction.values().length];
            try {
                iArr3[ApiAcatsTransfer.Asset.Direction.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ApiAcatsTransfer.Asset.Direction.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void bindHeader(RdsHeaderRowView rdsHeaderRowView, BuildPartialItem.Header header) {
        Intrinsics.checkNotNullParameter(rdsHeaderRowView, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        RdsHeaderRowView.bind$default(rdsHeaderRowView, rdsHeaderRowView.getContext().getText(header.getStringRes()), false, false, null, null, 30, null);
    }

    public static final void bindAddAsset(RdsRowView rdsRowView, BuildPartialItem.AddAsset addAsset) {
        Intrinsics.checkNotNullParameter(rdsRowView, "<this>");
        Intrinsics.checkNotNullParameter(addAsset, "addAsset");
        rdsRowView.setLeadingIconDrawable(rdsRowView.getContext().getDrawable(C20690R.drawable.ic_rds_bubble_plus_24dp));
        rdsRowView.setPrimaryText(rdsRowView.getContext().getText(addAsset.getStringRes()));
    }

    public static /* synthetic */ void bindAsset$default(RdsRowView rdsRowView, BuildPartialItem.Asset asset, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        bindAsset(rdsRowView, asset, z);
    }

    public static final void bindAsset(RdsRowView rdsRowView, BuildPartialItem.Asset asset, boolean z) {
        Intrinsics.checkNotNullParameter(rdsRowView, "<this>");
        Intrinsics.checkNotNullParameter(asset, "asset");
        UiAcatsAsset asset2 = asset.getAsset();
        if (asset2 instanceof UiAcatsAsset.CashAsset) {
            bindCashAsset(rdsRowView, (UiAcatsAsset.CashAsset) asset2);
        } else if (asset2 instanceof UiAcatsAsset.EquityAsset) {
            bindEquityAsset(rdsRowView, (UiAcatsAsset.EquityAsset) asset2);
        } else {
            if (!(asset2 instanceof UiAcatsAsset.OptionAsset)) {
                throw new NoWhenBranchMatchedException();
            }
            bindOptionAsset(rdsRowView, (UiAcatsAsset.OptionAsset) asset2);
        }
        if (z) {
            rdsRowView.setTrailingIconResource(C20690R.drawable.ic_rds_caret_right_16dp);
            ScarletManager2.overrideAttribute(rdsRowView, C13997R.attr.trailingIconTint, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3());
        }
    }

    private static final void bindCashAsset(RdsRowView rdsRowView, UiAcatsAsset.CashAsset cashAsset) {
        int i;
        String string2;
        Context context = rdsRowView.getContext();
        int i2 = WhenMappings.$EnumSwitchMapping$0[cashAsset.getCashType().ordinal()];
        if (i2 == 1) {
            i = C7686R.string.acats_in_build_partial_cash_asset_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C7686R.string.acats_in_build_partial_margin_asset_title;
        }
        rdsRowView.setPrimaryText(context.getText(i));
        rdsRowView.setSecondaryText(null);
        Money amount = cashAsset.getAmount();
        if (amount == null || (string2 = Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            string2 = rdsRowView.getContext().getString(C7686R.string.acats_in_build_partial_cash_asset_entire);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        rdsRowView.setMetadataPrimaryText(string2);
        rdsRowView.setMetadataSecondaryText(null);
    }

    private static final void bindEquityAsset(RdsRowView rdsRowView, UiAcatsAsset.EquityAsset equityAsset) throws Resources.NotFoundException {
        String quantityString;
        String string2;
        rdsRowView.setPrimaryText(equityAsset.getSymbol());
        rdsRowView.setSecondaryText(equityAsset.getName());
        if (equityAsset.getNumShares() == null) {
            quantityString = rdsRowView.getContext().getString(C7686R.string.acats_in_build_partial_equity_all_shares);
        } else {
            int quantityForDisplay = PositionAmountFormatting.formatQuantityForDisplay(equityAsset.getNumShares().intValue(), equityAsset.isShortPosition());
            quantityString = rdsRowView.getContext().getResources().getQuantityString(C7686R.plurals.acats_in_build_partial_equity_plural_numerical_shares, quantityForDisplay, Integer.valueOf(quantityForDisplay));
        }
        rdsRowView.setMetadataPrimaryText(quantityString);
        if (!equityAsset.isShortPosition() || equityAsset.getBorrowFee() == null) {
            string2 = null;
        } else {
            string2 = rdsRowView.getContext().getString(C7686R.string.acats_in_borrowing_fee_rate, Formats.getLeadingZeroesHundredthPercentFormat().format(equityAsset.getBorrowFee()));
        }
        rdsRowView.setMetadataSecondaryText(string2);
    }

    private static final void bindOptionAsset(RdsRowView rdsRowView, UiAcatsAsset.OptionAsset optionAsset) {
        int i;
        int i2;
        String string2;
        int i3 = WhenMappings.$EnumSwitchMapping$1[optionAsset.getOptionType().ordinal()];
        if (i3 == 1) {
            i = C7686R.string.acats_in_build_partial_options_title_call;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C7686R.string.acats_in_build_partial_options_title_put;
        }
        rdsRowView.setPrimaryText(rdsRowView.getContext().getString(i, optionAsset.getSymbol(), Formats.getStrikePriceFormat().format(optionAsset.getStrikePrice().getDecimalValue())));
        int i4 = WhenMappings.$EnumSwitchMapping$2[optionAsset.getDirection().ordinal()];
        if (i4 == 1) {
            i2 = C7686R.string.acats_in_build_partial_options_expiration_long;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C7686R.string.acats_in_build_partial_options_expiration_short;
        }
        rdsRowView.setSecondaryText(rdsRowView.getContext().getString(i2, LocalDateFormatter.SHORT.format(optionAsset.getExpirationDate())));
        if (optionAsset.getNumContracts() == null) {
            string2 = rdsRowView.getContext().getString(C7686R.string.acats_in_build_partial_options_all_contracts);
        } else {
            string2 = rdsRowView.getContext().getString(C7686R.string.acats_in_build_partial_options_numerical_contracts, optionAsset.getNumContracts().toString());
        }
        rdsRowView.setMetadataPrimaryText(string2);
        rdsRowView.setMetadataSecondaryText(null);
    }
}
