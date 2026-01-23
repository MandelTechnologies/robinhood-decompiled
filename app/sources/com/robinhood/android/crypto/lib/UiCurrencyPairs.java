package com.robinhood.android.crypto.lib;

import com.robinhood.models.api.ApiCurrency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiCurrencyPairs.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\f"}, m3636d2 = {"symbolWithTypeSingular", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSymbolWithTypeSingular", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;)Lcom/robinhood/utils/resource/StringResource;", "symbolWithType", "getSymbolWithType", "amount", "Ljava/math/BigDecimal;", "typeWithPrefix", "prefix", "", "feature-lib-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.lib.UiCurrencyPairsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class UiCurrencyPairs {

    /* compiled from: UiCurrencyPairs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.lib.UiCurrencyPairsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCurrency.Type.values().length];
            try {
                iArr[ApiCurrency.Type.TOKENIZED_STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCurrency.Type.CRYPTOCURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCurrency.Type.FIAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCurrency.Type.PERPETUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCurrency.Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getSymbolWithTypeSingular(UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[uiCurrencyPair.getType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C12914R.plurals.tokenized_label_with_symbol, 1), uiCurrencyPair.getDisplaySymbol());
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return StringResource.INSTANCE.invoke(uiCurrencyPair.getDisplaySymbol());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final StringResource getSymbolWithType(UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[uiCurrencyPair.getType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C12914R.plurals.tokenized_label_with_symbol, 9), uiCurrencyPair.getDisplaySymbol());
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return StringResource.INSTANCE.invoke(uiCurrencyPair.getDisplaySymbol());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final StringResource symbolWithType(UiCurrencyPair uiCurrencyPair, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        int i = WhenMappings.$EnumSwitchMapping$0[uiCurrencyPair.getType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C12914R.plurals.tokenized_label_with_symbol, BigDecimals7.m2977eq(amount, BigDecimal.ONE) ? 1 : 9), uiCurrencyPair.getDisplaySymbol());
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return StringResource.INSTANCE.invoke(uiCurrencyPair.getDisplaySymbol());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final StringResource typeWithPrefix(UiCurrencyPair uiCurrencyPair, BigDecimal amount, String prefix) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        int i = WhenMappings.$EnumSwitchMapping$0[uiCurrencyPair.getType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C12914R.plurals.tokenized_label_with_prefix, BigDecimals7.m2977eq(amount, BigDecimal.ONE) ? 1 : 9), prefix);
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return StringResource.INSTANCE.invoke(prefix);
        }
        throw new NoWhenBranchMatchedException();
    }
}
