package com.robinhood.shared.crypto.transfer.verification;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.models.api.transfer.ApiCryptoVaspResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse3;
import com.robinhood.models.api.transfer.verification.TransferCategory;
import com.robinhood.models.api.transfer.verification.WalletType;
import com.robinhood.shared.crypto.transfer.verification.VerificationNavGraph;
import com.robinhood.shared.crypto.transfer.verification.VerificationNavigationDestinations;
import com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposable;
import com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposable;
import com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable;
import com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposable;
import com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposable;
import com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposable;
import com.robinhood.shared.crypto.transfer.verification.result.ResultPendingComposable;
import com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable;
import com.robinhood.shared.crypto.transfer.verification.util.NextNavigation;
import com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VerificationNavGraph.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÐ\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0000¨\u0006\u001a"}, m3636d2 = {"verificationNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "transferId", "Ljava/util/UUID;", "verificationId", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "onTransferCategoryConfirmed", "Lkotlin/Function1;", "Lcom/robinhood/models/api/transfer/verification/TransferCategory;", "onWalletTypeConfirmed", "Lcom/robinhood/models/api/transfer/verification/WalletType;", "onBeneficiaryName", "Lkotlin/Function2;", "", "onBeneficiaryDob", "onVaspConfirmed", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "onVerificationCompleted", "Lkotlin/Function0;", "done", "viewTransferDetails", "contactSupport", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class VerificationNavGraph {

    /* compiled from: VerificationNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$1 */
    static final class C384721 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ Function1<TransferCategory, Unit> $onTransferCategoryConfirmed;
        final /* synthetic */ Function0<Unit> $onVerificationCompleted;
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;

        /* JADX WARN: Multi-variable type inference failed */
        C384721(UUID uuid, VerificationType verificationType, Function1<? super TransferCategory, Unit> function1, Function0<Unit> function0) {
            this.$verificationId = uuid;
            this.$verificationType = verificationType;
            this.$onTransferCategoryConfirmed = function1;
            this.$onVerificationCompleted = function0;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2086354459, i, -1, "com.robinhood.shared.crypto.transfer.verification.verificationNavGraph.<anonymous> (VerificationNavGraph.kt:40)");
            }
            UUID uuid = this.$verificationId;
            VerificationType verificationType = this.$verificationType;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$onTransferCategoryConfirmed) | ((((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256) | composer.changed(this.$onVerificationCompleted);
            final Function1<TransferCategory, Unit> function1 = this.$onTransferCategoryConfirmed;
            final Function0<Unit> function0 = this.$onVerificationCompleted;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VerificationNavGraph.C384721.invoke$lambda$1$lambda$0(function1, navigator, function0, (TransferCategory) obj, (ApiCryptoVerificationResponse) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TransferCategoryComposable.TransferCategoryComposable(uuid, verificationType, (Function2) objRememberedValue, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 3072, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, LifecycleAwareNavigator lifecycleAwareNavigator, Function0 function0, TransferCategory transferCategory, ApiCryptoVerificationResponse next) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(transferCategory, "transferCategory");
            Intrinsics.checkNotNullParameter(next, "next");
            function1.invoke(transferCategory);
            NextNavigation.handleNext(lifecycleAwareNavigator, next, function0);
            return Unit.INSTANCE;
        }
    }

    public static final void verificationNavGraph(NavGraphBuilder navGraphBuilder, NavHostController navController, final UUID uuid, final UUID verificationId, final VerificationType verificationType, Function1<? super TransferCategory, Unit> onTransferCategoryConfirmed, Function1<? super WalletType, Unit> onWalletTypeConfirmed, Function2<? super String, ? super String, Unit> onBeneficiaryName, Function1<? super String, Unit> onBeneficiaryDob, Function1<? super ApiCryptoVaspResponse.Vasp, Unit> onVaspConfirmed, Function0<Unit> onVerificationCompleted, final Function0<Unit> done, final Function0<Unit> viewTransferDetails, final Function0<Unit> contactSupport) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        Intrinsics.checkNotNullParameter(onTransferCategoryConfirmed, "onTransferCategoryConfirmed");
        Intrinsics.checkNotNullParameter(onWalletTypeConfirmed, "onWalletTypeConfirmed");
        Intrinsics.checkNotNullParameter(onBeneficiaryName, "onBeneficiaryName");
        Intrinsics.checkNotNullParameter(onBeneficiaryDob, "onBeneficiaryDob");
        Intrinsics.checkNotNullParameter(onVaspConfirmed, "onVaspConfirmed");
        Intrinsics.checkNotNullParameter(onVerificationCompleted, "onVerificationCompleted");
        Intrinsics.checkNotNullParameter(done, "done");
        Intrinsics.checkNotNullParameter(viewTransferDetails, "viewTransferDetails");
        Intrinsics.checkNotNullParameter(contactSupport, "contactSupport");
        NavGraphBuilders.composable(navGraphBuilder, navController, VerificationNavigationDestinations7.INSTANCE, ComposableLambda3.composableLambdaInstance(-2086354459, true, new C384721(verificationId, verificationType, onTransferCategoryConfirmed, onVerificationCompleted)));
        NavGraphBuilders.composable(navGraphBuilder, navController, VerificationNavigationDestinations8.INSTANCE, ComposableLambda3.composableLambdaInstance(1338244316, true, new C384732(verificationId, verificationType, onWalletTypeConfirmed, onVerificationCompleted)));
        NavGraphBuilders.composable(navGraphBuilder, navController, VerificationNavigationDestinations2.INSTANCE, ComposableLambda3.composableLambdaInstance(-525972515, true, new C384743(onBeneficiaryName)));
        NavGraphBuilders.composable(navGraphBuilder, navController, VerificationNavigationDestinations.INSTANCE, ComposableLambda3.composableLambdaInstance(1904777950, true, new C384754(verificationId, verificationType, onBeneficiaryDob, onVerificationCompleted)));
        NavGraphBuilders.composable(navGraphBuilder, navController, VerificationNavigationDestinations6.INSTANCE, ComposableLambda3.composableLambdaInstance(40561119, true, new C384765(verificationId, verificationType, onVaspConfirmed, onVerificationCompleted)));
        NavGraphBuilders.composable(navGraphBuilder, navController, VerificationNavigationDestinations9.INSTANCE, ComposableLambda3.composableLambdaInstance(-1823655712, true, new C384776(verificationId, verificationType, onVerificationCompleted)));
        NavGraphBuilders.composable(navGraphBuilder, navController, VerificationNavigationDestinations5.INSTANCE, ComposableLambda3.composableLambdaInstance(607094753, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt.verificationNavGraph.7
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(607094753, i, -1, "com.robinhood.shared.crypto.transfer.verification.verificationNavGraph.<anonymous> (VerificationNavGraph.kt:110)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ResultPendingComposable.ResultPendingComposable(verificationId, verificationType, (ApiCryptoVerificationResponse3.Content) ComposableCompanion.args(entry), done, viewTransferDetails, modifierFillMaxSize$default, composer, 196608, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, VerificationNavigationDestinations3.INSTANCE, ComposableLambda3.composableLambdaInstance(-1257122078, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt.verificationNavGraph.8
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1257122078, i, -1, "com.robinhood.shared.crypto.transfer.verification.verificationNavGraph.<anonymous> (VerificationNavGraph.kt:120)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ResultBlockAndRefundComposable.ResultBlockAndRefundComposable(uuid, verificationId, verificationType, (ApiCryptoVerificationResponse3.Content) ComposableCompanion.args(entry), done, modifierFillMaxSize$default, null, composer, 196608, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, VerificationNavigationDestinations4.INSTANCE, ComposableLambda3.composableLambdaInstance(1173628387, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt.verificationNavGraph.9
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1173628387, i, -1, "com.robinhood.shared.crypto.transfer.verification.verificationNavGraph.<anonymous> (VerificationNavGraph.kt:130)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ResultContactSupportComposable.ResultContactSupportComposable(verificationId, verificationType, (ApiCryptoVerificationResponse3.Content) ComposableCompanion.args(entry), contactSupport, done, modifierFillMaxSize$default, composer, 196608, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* compiled from: VerificationNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$2 */
    static final class C384732 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onVerificationCompleted;
        final /* synthetic */ Function1<WalletType, Unit> $onWalletTypeConfirmed;
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;

        /* JADX WARN: Multi-variable type inference failed */
        C384732(UUID uuid, VerificationType verificationType, Function1<? super WalletType, Unit> function1, Function0<Unit> function0) {
            this.$verificationId = uuid;
            this.$verificationType = verificationType;
            this.$onWalletTypeConfirmed = function1;
            this.$onVerificationCompleted = function0;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1338244316, i, -1, "com.robinhood.shared.crypto.transfer.verification.verificationNavGraph.<anonymous> (VerificationNavGraph.kt:51)");
            }
            ApiCryptoVerificationResponse3.CheckIfHosted checkIfHosted = (ApiCryptoVerificationResponse3.CheckIfHosted) ComposableCompanion.args(entry);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            UUID uuid = this.$verificationId;
            boolean z = true;
            VerificationType verificationType = this.$verificationType;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$onWalletTypeConfirmed);
            if ((((i & 896) ^ 384) <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
                z = false;
            }
            boolean zChanged2 = z | zChanged | composer.changed(this.$onVerificationCompleted);
            final Function1<WalletType, Unit> function1 = this.$onWalletTypeConfirmed;
            final Function0<Unit> function0 = this.$onVerificationCompleted;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VerificationNavGraph.C384732.invoke$lambda$1$lambda$0(function1, navigator, function0, (WalletType) obj, (ApiCryptoVerificationResponse) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            WalletTypeComposable.WalletTypeComposable(checkIfHosted, uuid, verificationType, (Function2) objRememberedValue, modifierFillMaxSize$default, null, composer, 24576, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, LifecycleAwareNavigator lifecycleAwareNavigator, Function0 function0, WalletType walletType, ApiCryptoVerificationResponse next) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(walletType, "walletType");
            Intrinsics.checkNotNullParameter(next, "next");
            function1.invoke(walletType);
            NextNavigation.handleNext(lifecycleAwareNavigator, next, function0);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: VerificationNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$3 */
    static final class C384743 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ Function2<String, String, Unit> $onBeneficiaryName;

        /* JADX WARN: Multi-variable type inference failed */
        C384743(Function2<? super String, ? super String, Unit> function2) {
            this.$onBeneficiaryName = function2;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-525972515, i, -1, "com.robinhood.shared.crypto.transfer.verification.verificationNavGraph.<anonymous> (VerificationNavGraph.kt:63)");
            }
            boolean z = true;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onBeneficiaryName);
            if ((((i & 896) ^ 384) <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
                z = false;
            }
            boolean z2 = zChanged | z;
            final Function2<String, String, Unit> function2 = this.$onBeneficiaryName;
            Object objRememberedValue = composer.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VerificationNavGraph.C384743.invoke$lambda$1$lambda$0(function2, navigator, (String) obj, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BeneficiaryNameComposable.BeneficiaryNameComposable(modifierFillMaxSize$default, (Function2) objRememberedValue, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function2 function2, LifecycleAwareNavigator lifecycleAwareNavigator, String firstName, String lastName) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            function2.invoke(firstName, lastName);
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, VerificationNavigationDestinations.INSTANCE, new VerificationNavigationDestinations.Args(firstName, lastName), null, null, false, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: VerificationNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$4 */
    static final class C384754 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ Function1<String, Unit> $onBeneficiaryDob;
        final /* synthetic */ Function0<Unit> $onVerificationCompleted;
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;

        /* JADX WARN: Multi-variable type inference failed */
        C384754(UUID uuid, VerificationType verificationType, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.$verificationId = uuid;
            this.$verificationType = verificationType;
            this.$onBeneficiaryDob = function1;
            this.$onVerificationCompleted = function0;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1904777950, i, -1, "com.robinhood.shared.crypto.transfer.verification.verificationNavGraph.<anonymous> (VerificationNavGraph.kt:75)");
            }
            VerificationNavigationDestinations.Args args = (VerificationNavigationDestinations.Args) ComposableCompanion.args(entry);
            String firstName = args.getFirstName();
            String lastName = args.getLastName();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            UUID uuid = this.$verificationId;
            boolean z = true;
            VerificationType verificationType = this.$verificationType;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$onBeneficiaryDob);
            if ((((i & 896) ^ 384) <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
                z = false;
            }
            boolean zChanged2 = z | zChanged | composer.changed(this.$onVerificationCompleted);
            final Function1<String, Unit> function1 = this.$onBeneficiaryDob;
            final Function0<Unit> function0 = this.$onVerificationCompleted;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VerificationNavGraph.C384754.invoke$lambda$1$lambda$0(function1, navigator, function0, (String) obj, (ApiCryptoVerificationResponse) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BeneficiaryDobComposable.BeneficiaryDobComposable(uuid, verificationType, firstName, lastName, (Function2) objRememberedValue, modifierFillMaxSize$default, null, composer, 196608, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, LifecycleAwareNavigator lifecycleAwareNavigator, Function0 function0, String dob, ApiCryptoVerificationResponse next) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(dob, "dob");
            Intrinsics.checkNotNullParameter(next, "next");
            function1.invoke(dob);
            NextNavigation.handleNext(lifecycleAwareNavigator, next, function0);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: VerificationNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$5 */
    static final class C384765 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ Function1<ApiCryptoVaspResponse.Vasp, Unit> $onVaspConfirmed;
        final /* synthetic */ Function0<Unit> $onVerificationCompleted;
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;

        /* JADX WARN: Multi-variable type inference failed */
        C384765(UUID uuid, VerificationType verificationType, Function1<? super ApiCryptoVaspResponse.Vasp, Unit> function1, Function0<Unit> function0) {
            this.$verificationId = uuid;
            this.$verificationType = verificationType;
            this.$onVaspConfirmed = function1;
            this.$onVerificationCompleted = function0;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(40561119, i, -1, "com.robinhood.shared.crypto.transfer.verification.verificationNavGraph.<anonymous> (VerificationNavGraph.kt:89)");
            }
            boolean z = true;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            UUID uuid = this.$verificationId;
            VerificationType verificationType = this.$verificationType;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$onVaspConfirmed);
            if ((((i & 896) ^ 384) <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
                z = false;
            }
            boolean zChanged2 = zChanged | z | composer.changed(this.$onVerificationCompleted);
            final Function1<ApiCryptoVaspResponse.Vasp, Unit> function1 = this.$onVaspConfirmed;
            final Function0<Unit> function0 = this.$onVerificationCompleted;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VerificationNavGraph.C384765.invoke$lambda$1$lambda$0(function1, navigator, function0, (ApiCryptoVaspResponse.Vasp) obj, (ApiCryptoVerificationResponse) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ExchangeComposable.ExchangeComposable(uuid, verificationType, (Function2) objRememberedValue, modifierFillMaxSize$default, null, composer, 3072, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, LifecycleAwareNavigator lifecycleAwareNavigator, Function0 function0, ApiCryptoVaspResponse.Vasp vasp, ApiCryptoVerificationResponse next) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(vasp, "vasp");
            Intrinsics.checkNotNullParameter(next, "next");
            function1.invoke(vasp);
            NextNavigation.handleNext(lifecycleAwareNavigator, next, function0);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: VerificationNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$6 */
    static final class C384776 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onVerificationCompleted;
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;

        C384776(UUID uuid, VerificationType verificationType, Function0<Unit> function0) {
            this.$verificationId = uuid;
            this.$verificationType = verificationType;
            this.$onVerificationCompleted = function0;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1823655712, i, -1, "com.robinhood.shared.crypto.transfer.verification.verificationNavGraph.<anonymous> (VerificationNavGraph.kt:100)");
            }
            boolean z = true;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            UUID uuid = this.$verificationId;
            VerificationType verificationType = this.$verificationType;
            composer.startReplaceGroup(-1633490746);
            if ((((i & 896) ^ 384) <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
                z = false;
            }
            boolean zChanged = composer.changed(this.$onVerificationCompleted) | z;
            final Function0<Unit> function0 = this.$onVerificationCompleted;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationNavGraphKt$verificationNavGraph$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return VerificationNavGraph.C384776.invoke$lambda$1$lambda$0(navigator, function0, (ApiCryptoVerificationResponse) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            WalletVerificationComposable.WalletVerificationComposable(uuid, verificationType, (Function1) objRememberedValue, modifierFillMaxSize$default, null, composer, 3072, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, Function0 function0, ApiCryptoVerificationResponse next) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(next, "next");
            NextNavigation.handleNext(lifecycleAwareNavigator, next, function0);
            return Unit.INSTANCE;
        }
    }
}
