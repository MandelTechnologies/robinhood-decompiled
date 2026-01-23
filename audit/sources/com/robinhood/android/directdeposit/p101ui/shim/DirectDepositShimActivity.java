package com.robinhood.android.directdeposit.p101ui.shim;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.ComponentActivity6;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.util.DeactivatedAccountUtils;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage;
import com.robinhood.android.directdeposit.p101ui.shim.DirectDepositShimDuxo6;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectDepositShimActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onDialogDismissed", "id", "onPositiveButtonClicked", "", "passthroughArgs", "onNegativeButtonClicked", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositShimActivity extends BaseActivity implements RhDialogFragment.OnDismissListener {
    private static final int REQUEST_CODE_DIRECT_DEPOSIT = 3;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, DirectDepositShimDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private final DirectDepositShimDuxo getDuxo() {
        return (DirectDepositShimDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewFindViewById = findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(viewFindViewById, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        if (savedInstanceState != null) {
            return;
        }
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(1989569874, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimActivity.onCreate.1
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
                    ComposerKt.traceEventStart(1989569874, i, -1, "com.robinhood.android.directdeposit.ui.shim.DirectDepositShimActivity.onCreate.<anonymous> (DirectDepositShimActivity.kt:46)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(DirectDepositShimActivity.this));
                final DirectDepositShimActivity directDepositShimActivity = DirectDepositShimActivity.this;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(495853408, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimActivity.onCreate.1.1
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
                            ComposerKt.traceEventStart(495853408, i2, -1, "com.robinhood.android.directdeposit.ui.shim.DirectDepositShimActivity.onCreate.<anonymous>.<anonymous> (DirectDepositShimActivity.kt:47)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        DirectDepositShimActivity directDepositShimActivity2 = directDepositShimActivity;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(DirectDepositShimActivity2.INSTANCE.m13334getLambda$552610019$feature_direct_deposit_externalDebug(), null, null, null, null, false, false, null, null, 0L, null, composer2, 6, 0, 2046);
                        Companion companion3 = DirectDepositShimActivity.INSTANCE;
                        if (((DirectDepositShimKey) companion3.getExtras((Activity) directDepositShimActivity2)).getFromTransfersHub() || ((DirectDepositShimKey) companion3.getExtras((Activity) directDepositShimActivity2)).getFromDirectDepositToBrokerageDeeplink()) {
                            composer2.startReplaceGroup(-641183410);
                            LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(companion, DirectDepositBrokerageExperimentPage.LOADING_INDICATOR), true, true, 3, composer2, 3510, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-640851369);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(companion, DirectDepositBrokerageExperimentPage.LOADING_INDICATOR), null, true, true, composer2, 3462, 2);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositShimActivity.onCreate$lambda$0(this.f$0, (DirectDepositShimDuxo6) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(DirectDepositShimActivity directDepositShimActivity, DirectDepositShimDuxo6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof DirectDepositShimDuxo6.Loading)) {
            if (state instanceof DirectDepositShimDuxo6.Loaded) {
                DirectDepositShimDuxo6.Loaded loaded = (DirectDepositShimDuxo6.Loaded) state;
                if (loaded.getIntentKey() != null) {
                    Navigator.DefaultImpls.startActivityForResult$default(directDepositShimActivity.getNavigator(), (Activity) directDepositShimActivity, loaded.getIntentKey(), 3, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
                    directDepositShimActivity.overridePendingTransition(0, 0);
                } else {
                    directDepositShimActivity.finish();
                }
            } else {
                if (!(state instanceof DirectDepositShimDuxo6.DeactivatedAccount)) {
                    throw new NoWhenBranchMatchedException();
                }
                DeactivatedAccountUtils.showDeactivatedAccountDialog(directDepositShimActivity, C9631R.string.transfers_deactivated_account_message);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 3) {
            setResult(resultCode, data);
            finish();
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C9631R.id.dialog_id_deactivated_account) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C9631R.id.dialog_id_deactivated_account) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C9631R.id.dialog_id_deactivated_account) {
            Navigators3.showContactSupportTriageFragment$default(getNavigator(), this, null, false, 6, null);
            finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: DirectDepositShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimActivity;", "Lcom/robinhood/android/transfers/contracts/DirectDepositShimKey;", "<init>", "()V", "REQUEST_CODE_DIRECT_DEPOSIT", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DirectDepositShimActivity, DirectDepositShimKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public DirectDepositShimKey getExtras(DirectDepositShimActivity directDepositShimActivity) {
            return (DirectDepositShimKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, directDepositShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, DirectDepositShimKey directDepositShimKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, directDepositShimKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, DirectDepositShimKey directDepositShimKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, directDepositShimKey);
        }
    }
}
