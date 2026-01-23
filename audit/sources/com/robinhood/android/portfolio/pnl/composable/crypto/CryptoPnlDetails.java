package com.robinhood.android.portfolio.pnl.composable.crypto;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.C25673R;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: CryptoPnlDetails.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CryptoPnlDetails {
    public static final CryptoPnlDetails INSTANCE = new CryptoPnlDetails();

    /* renamed from: lambda$-309406596, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9179lambda$309406596 = ComposableLambda3.composableLambdaInstance(-309406596, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt$lambda$-309406596$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-309406596, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt.lambda$-309406596.<anonymous> (CryptoPnlDetails.kt:123)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25673R.string.pnl_hub_trade_cost_at_open, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1909974349, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9177lambda$1909974349 = ComposableLambda3.composableLambdaInstance(-1909974349, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt$lambda$-1909974349$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1909974349, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt.lambda$-1909974349.<anonymous> (CryptoPnlDetails.kt:162)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25673R.string.pnl_hub_trade_credit_at_close, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-838093608, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9180lambda$838093608 = ComposableLambda3.composableLambdaInstance(-838093608, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt$lambda$-838093608$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-838093608, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt.lambda$-838093608.<anonymous> (CryptoPnlDetails.kt:277)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            AssetClass assetClass = AssetClass.CRYPTO;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            Money money$default = Money3.toMoney$default(new BigDecimal("10"), null, 1, null);
            BigDecimal bigDecimal = new BigDecimal("0.0123");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
            BigDecimal bigDecimal2 = new BigDecimal(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
            Money money$default2 = Money3.toMoney$default(new BigDecimal("-60"), null, 1, null);
            Money money$default3 = Money3.toMoney$default(new BigDecimal("90"), null, 1, null);
            Money money$default4 = Money3.toMoney$default(new BigDecimal("20"), null, 1, null);
            Money money$default5 = Money3.toMoney$default(new BigDecimal("30"), null, 1, null);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
            CryptoPnlDetails9.CryptoPnlDetails(new ProfitAndLossTradeItem(uuidRandomUUID, assetClass, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, instantOfEpochMilli, "limit buy", money$default, bigDecimal, instantOfEpochMilli2, bigDecimal2, money$default2, money$default3, money$default4, money$default5, "limit buy", new ProfitAndLossOrderDetails.CryptoOrderDetails(uuidRandomUUID2, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, null, null), null, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-993862665, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9182lambda$993862665 = ComposableLambda3.composableLambdaInstance(-993862665, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt$lambda$-993862665$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-993862665, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt.lambda$-993862665.<anonymous> (CryptoPnlDetails.kt:310)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            AssetClass assetClass = AssetClass.CRYPTO;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            Money money$default = Money3.toMoney$default(new BigDecimal("-10"), null, 1, null);
            BigDecimal bigDecimal = new BigDecimal("-0.0123");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
            BigDecimal bigDecimal2 = new BigDecimal(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
            Money money$default2 = Money3.toMoney$default(new BigDecimal("-60"), null, 1, null);
            Money money$default3 = Money3.toMoney$default(new BigDecimal("90"), null, 1, null);
            Money money$default4 = Money3.toMoney$default(new BigDecimal("20"), null, 1, null);
            Money money$default5 = Money3.toMoney$default(new BigDecimal("30"), null, 1, null);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
            CryptoPnlDetails9.CryptoPnlDetails(new ProfitAndLossTradeItem(uuidRandomUUID, assetClass, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, instantOfEpochMilli, "limit buy", money$default, bigDecimal, instantOfEpochMilli2, bigDecimal2, money$default2, money$default3, money$default4, money$default5, "limit buy", new ProfitAndLossOrderDetails.CryptoOrderDetails(uuidRandomUUID2, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, null, null), null, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-894163466, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9181lambda$894163466 = ComposableLambda3.composableLambdaInstance(-894163466, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt$lambda$-894163466$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-894163466, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt.lambda$-894163466.<anonymous> (CryptoPnlDetails.kt:343)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            AssetClass assetClass = AssetClass.CRYPTO;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            Money money$default = Money3.toMoney$default(new BigDecimal("-10"), null, 1, null);
            BigDecimal bigDecimal = new BigDecimal("-0.0123");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
            BigDecimal bigDecimal2 = new BigDecimal(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
            Money money$default2 = Money3.toMoney$default(new BigDecimal("60"), null, 1, null);
            Money money$default3 = Money3.toMoney$default(new BigDecimal("90"), null, 1, null);
            Money money$default4 = Money3.toMoney$default(new BigDecimal("20"), null, 1, null);
            Money money$default5 = Money3.toMoney$default(new BigDecimal("30"), null, 1, null);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
            CryptoPnlDetails9.CryptoPnlDetails(new ProfitAndLossTradeItem(uuidRandomUUID, assetClass, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, instantOfEpochMilli, "limit buy", money$default, bigDecimal, instantOfEpochMilli2, bigDecimal2, money$default2, money$default3, money$default4, money$default5, "limit buy", new ProfitAndLossOrderDetails.CryptoOrderDetails(uuidRandomUUID2, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, null, new ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent(new BigDecimal(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION), null, Money3.toMoney$default(new BigDecimal("40"), null, 1, null), null, Money3.toMoney$default(new BigDecimal("200"), null, 1, null), null, null)), null, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-235603899, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9178lambda$235603899 = ComposableLambda3.composableLambdaInstance(-235603899, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt$lambda$-235603899$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-235603899, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.ComposableSingletons$CryptoPnlDetailsKt.lambda$-235603899.<anonymous> (CryptoPnlDetails.kt:384)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            AssetClass assetClass = AssetClass.CRYPTO;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            Money money$default = Money3.toMoney$default(new BigDecimal("-10"), null, 1, null);
            BigDecimal bigDecimal = new BigDecimal("-0.0123");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
            BigDecimal bigDecimal2 = new BigDecimal(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
            Money money$default2 = Money3.toMoney$default(new BigDecimal("60"), null, 1, null);
            Money money$default3 = Money3.toMoney$default(new BigDecimal("90"), null, 1, null);
            Money money$default4 = Money3.toMoney$default(new BigDecimal("20"), null, 1, null);
            Money money$default5 = Money3.toMoney$default(new BigDecimal("30"), null, 1, null);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
            CryptoPnlDetails9.CryptoPnlDetails(new ProfitAndLossTradeItem(uuidRandomUUID, assetClass, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, instantOfEpochMilli, "limit buy", money$default, bigDecimal, instantOfEpochMilli2, bigDecimal2, money$default2, money$default3, money$default4, money$default5, "limit buy", new ProfitAndLossOrderDetails.CryptoOrderDetails(uuidRandomUUID2, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, new ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent(new BigDecimal(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION), Money3.toMoney$default(new BigDecimal(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION), null, 1, null), Money3.toMoney$default(new BigDecimal("40"), null, 1, null), Money3.toMoney$default(new BigDecimal("-5"), null, 1, null), Money3.toMoney$default(new BigDecimal("200"), null, 1, null), Money3.toMoney$default(new BigDecimal("180"), null, 1, null), new BigDecimal("3.123")), new ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent(new BigDecimal(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION), null, Money3.toMoney$default(new BigDecimal("40"), null, 1, null), null, Money3.toMoney$default(new BigDecimal("200"), null, 1, null), null, null)), null, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1909974349$lib_profit_and_loss_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17668getLambda$1909974349$lib_profit_and_loss_externalDebug() {
        return f9177lambda$1909974349;
    }

    /* renamed from: getLambda$-235603899$lib_profit_and_loss_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17669getLambda$235603899$lib_profit_and_loss_externalDebug() {
        return f9178lambda$235603899;
    }

    /* renamed from: getLambda$-309406596$lib_profit_and_loss_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17670getLambda$309406596$lib_profit_and_loss_externalDebug() {
        return f9179lambda$309406596;
    }

    /* renamed from: getLambda$-838093608$lib_profit_and_loss_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17671getLambda$838093608$lib_profit_and_loss_externalDebug() {
        return f9180lambda$838093608;
    }

    /* renamed from: getLambda$-894163466$lib_profit_and_loss_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17672getLambda$894163466$lib_profit_and_loss_externalDebug() {
        return f9181lambda$894163466;
    }

    /* renamed from: getLambda$-993862665$lib_profit_and_loss_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17673getLambda$993862665$lib_profit_and_loss_externalDebug() {
        return f9182lambda$993862665;
    }
}
