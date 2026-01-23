package com.robinhood.android.crypto.costbasis.details;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import androidx.view.compose.ComponentActivity6;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.crypto.contracts.CryptoCostBasisDetailsIntentKey;
import com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsActivity;
import com.robinhood.android.crypto.costbasis.utils.CostBasisErrorHandler;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.regiongate.CryptoUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler2;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoCostBasisDetailsActivity.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\t\u0010\t\u001a\u00020\nH\u0096\u0001R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/CryptoCostBasisDetailsActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoCostBasisDetailsActivity extends BaseActivity implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoUsRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(-900778890, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsActivity.onCreate.1
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
                    ComposerKt.traceEventStart(-900778890, i, -1, "com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsActivity.onCreate.<anonymous> (CryptoCostBasisDetailsActivity.kt:30)");
                }
                final NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composer, 0);
                composer.startReplaceGroup(1849434622);
                CryptoCostBasisDetailsActivity cryptoCostBasisDetailsActivity = CryptoCostBasisDetailsActivity.this;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CostBasisErrorHandler(cryptoCostBasisDetailsActivity);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ProvidedValue[] providedValueArr = {LocalNavigator.getLocalNavigator().provides(CryptoCostBasisDetailsActivity.this.getNavigator()), AbsErrorHandler2.getLocalErrorHandler().provides((CostBasisErrorHandler) objRememberedValue)};
                final CryptoCostBasisDetailsActivity cryptoCostBasisDetailsActivity2 = CryptoCostBasisDetailsActivity.this;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(1860122934, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsActivity.onCreate.1.1

                    /* compiled from: CryptoCostBasisDetailsActivity.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C497291 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ NavHostController $navController;
                        final /* synthetic */ CryptoCostBasisDetailsActivity this$0;

                        C497291(CryptoCostBasisDetailsActivity cryptoCostBasisDetailsActivity, NavHostController navHostController) {
                            this.this$0 = cryptoCostBasisDetailsActivity;
                            this.$navController = navHostController;
                        }

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
                                ComposerKt.traceEventStart(1632168174, i, -1, "com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisDetailsActivity.kt:39)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final CryptoCostBasisDetailsActivity cryptoCostBasisDetailsActivity = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsActivity$onCreate$1$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CryptoCostBasisDetailsActivity.C127841.AnonymousClass1.C497291.invoke$lambda$1$lambda$0(cryptoCostBasisDetailsActivity, (NavGraphBuilder) obj, (NavHostController) obj2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navController, extensions2.persistentSetOf((Function2) objRememberedValue), CryptoCostBasisDetailsDestinations3.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), modifierFillMaxSize$default, composer, (ComposableDestination.$stable << 6) | 24576, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(CryptoCostBasisDetailsActivity cryptoCostBasisDetailsActivity, NavGraphBuilder persistentSetOf, NavHostController navController) {
                            Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
                            Intrinsics.checkNotNullParameter(navController, "navController");
                            CryptoCostBasisDetailsNavGraph.cryptoCostBasisDetailsNavGraph(persistentSetOf, (CryptoCostBasisDetailsIntentKey) CryptoCostBasisDetailsActivity.INSTANCE.getExtras((Activity) cryptoCostBasisDetailsActivity), navController);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1860122934, i2, -1, "com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsActivity.onCreate.<anonymous>.<anonymous> (CryptoCostBasisDetailsActivity.kt:38)");
                        }
                        BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1632168174, true, new C497291(cryptoCostBasisDetailsActivity2, navHostControllerRememberNavController), composer2, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
    }

    /* compiled from: CryptoCostBasisDetailsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/CryptoCostBasisDetailsActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/crypto/costbasis/details/CryptoCostBasisDetailsActivity;", "Lcom/robinhood/android/crypto/contracts/CryptoCostBasisDetailsIntentKey;", "<init>", "()V", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CryptoCostBasisDetailsActivity, CryptoCostBasisDetailsIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CryptoCostBasisDetailsIntentKey getExtras(CryptoCostBasisDetailsActivity cryptoCostBasisDetailsActivity) {
            return (CryptoCostBasisDetailsIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, cryptoCostBasisDetailsActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoCostBasisDetailsIntentKey cryptoCostBasisDetailsIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, cryptoCostBasisDetailsIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CryptoCostBasisDetailsIntentKey cryptoCostBasisDetailsIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, cryptoCostBasisDetailsIntentKey);
        }
    }
}
