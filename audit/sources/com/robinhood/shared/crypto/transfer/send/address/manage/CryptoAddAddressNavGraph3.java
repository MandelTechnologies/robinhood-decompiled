package com.robinhood.shared.crypto.transfer.send.address.manage;

import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.shared.crypto.contracts.transfers.CryptoAddSavedAddressFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAddAddressNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"cryptoAddAddressNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "args", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoAddSavedAddressFragmentKey;", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddAddressNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAddAddressNavGraph3 {
    public static final void cryptoAddAddressNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, final CryptoAddSavedAddressFragmentKey args) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(args, "args");
        NavGraphBuilders.navigation(navGraphBuilder, CryptoAddAddressNavDestinations2.INSTANCE, CryptoAddAddressNavDestinations3.INSTANCE, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddAddressNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoAddAddressNavGraph3.cryptoAddAddressNavGraph$lambda$0(navController, args, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoAddAddressNavGraph$lambda$0(NavHostController navHostController, CryptoAddSavedAddressFragmentKey cryptoAddSavedAddressFragmentKey, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        NavGraphBuilders.composable(navigation, navHostController, CryptoAddAddressNavDestinations2.INSTANCE, ComposableLambda3.composableLambdaInstance(267532985, true, new CryptoAddAddressNavGraph4(cryptoAddSavedAddressFragmentKey)));
        NavGraphBuilders.composable(navigation, navHostController, CryptoAddAddressNavDestinations.INSTANCE, CryptoAddAddressNavGraph.INSTANCE.getLambda$789675490$feature_crypto_transfer_externalDebug());
        return Unit.INSTANCE;
    }
}
