package com.robinhood.shared.crypto.acats;

import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"cryptoAcatsNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "feature-acats_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.CryptoAcatsNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAcatsNavGraph9 {
    public static final void cryptoAcatsNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        NavGraphBuilders.navigation(navGraphBuilder, MigrationIntroDest.INSTANCE, CryptoAcatsRootDest.INSTANCE, new Function1() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoAcatsNavGraph9.cryptoAcatsNavGraph$lambda$0(navController, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoAcatsNavGraph$lambda$0(NavHostController navHostController, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        MigrationIntroDest migrationIntroDest = MigrationIntroDest.INSTANCE;
        CryptoAcatsNavGraph cryptoAcatsNavGraph = CryptoAcatsNavGraph.INSTANCE;
        NavGraphBuilders.composable(navigation, navHostController, migrationIntroDest, cryptoAcatsNavGraph.getLambda$1613901309$feature_acats_externalRelease());
        NavGraphBuilders.composable(navigation, navHostController, MigrationExplainerDest.INSTANCE, cryptoAcatsNavGraph.m24865getLambda$395710618$feature_acats_externalRelease());
        NavGraphBuilders.composable(navigation, navHostController, MigrationReviewAssetsDest.INSTANCE, cryptoAcatsNavGraph.m24866getLambda$632328443$feature_acats_externalRelease());
        NavGraphBuilders.composable(navigation, navHostController, MigrationSubmitAssetsDest.INSTANCE, cryptoAcatsNavGraph.m24867getLambda$868946268$feature_acats_externalRelease());
        NavGraphBuilders.composable(navigation, navHostController, MigrationAssetsListDest.INSTANCE, cryptoAcatsNavGraph.m24862getLambda$1105564093$feature_acats_externalRelease());
        NavGraphBuilders.composable(navigation, navHostController, MigrationSubmissionConfirmationDest.INSTANCE, cryptoAcatsNavGraph.m24863getLambda$1342181918$feature_acats_externalRelease());
        NavGraphBuilders.composable(navigation, navHostController, MigrationSubmissionFailureDest.INSTANCE, cryptoAcatsNavGraph.m24864getLambda$1578799743$feature_acats_externalRelease());
        return Unit.INSTANCE;
    }
}
