package com.robinhood.android.transfers.history;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.PaymentIntentHistoryDetailKey;
import com.robinhood.android.transfers.history.PaymentIntentHistoryDetailFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentIntentHistoryDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0012\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u000fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "showExchangeRateInfoSheet", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PaymentIntentHistoryDetailFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PaymentIntentHistoryDetailDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(PaymentIntentHistoryDetailFragment paymentIntentHistoryDetailFragment, int i, Composer composer, int i2) {
        paymentIntentHistoryDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentIntentHistoryDetailDuxo getDuxo() {
        return (PaymentIntentHistoryDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* compiled from: PaymentIntentHistoryDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailFragment$ComposeContent$1 */
    static final class C302611 implements Function2<Composer, Integer, Unit> {
        C302611() {
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
                ComposerKt.traceEventStart(974286499, i, -1, "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailFragment.ComposeContent.<anonymous> (PaymentIntentHistoryDetailFragment.kt:28)");
            }
            PaymentIntentHistoryDetailDuxo duxo = PaymentIntentHistoryDetailFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(PaymentIntentHistoryDetailFragment.this);
            final PaymentIntentHistoryDetailFragment paymentIntentHistoryDetailFragment = PaymentIntentHistoryDetailFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentIntentHistoryDetailFragment.C302611.invoke$lambda$1$lambda$0(paymentIntentHistoryDetailFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(PaymentIntentHistoryDetailFragment.this);
            final PaymentIntentHistoryDetailFragment paymentIntentHistoryDetailFragment2 = PaymentIntentHistoryDetailFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentIntentHistoryDetailFragment.C302611.invoke$lambda$3$lambda$2(paymentIntentHistoryDetailFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            PaymentIntentHistoryDetailComposable3.PaymentIntentHistoryDetailComposable(duxo, function0, (Function0) objRememberedValue2, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PaymentIntentHistoryDetailFragment paymentIntentHistoryDetailFragment) {
            paymentIntentHistoryDetailFragment.requireActivity().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(PaymentIntentHistoryDetailFragment paymentIntentHistoryDetailFragment) {
            paymentIntentHistoryDetailFragment.showExchangeRateInfoSheet();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-793267877);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-793267877, i2, -1, "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailFragment.ComposeContent (PaymentIntentHistoryDetailFragment.kt:26)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(974286499, true, new C302611(), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentIntentHistoryDetailFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showExchangeRateInfoSheet() {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new SduiInfoSheetKey("foreign_currency_conversion_rate_details", "foreign_currency_conversion_rate_details", null, null, 12, null), null, 2, null).show(getChildFragmentManager(), "exchange_rate_details");
    }

    /* compiled from: PaymentIntentHistoryDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailFragment;", "Lcom/robinhood/android/transfers/contracts/PaymentIntentHistoryDetailKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PaymentIntentHistoryDetailFragment, PaymentIntentHistoryDetailKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PaymentIntentHistoryDetailKey paymentIntentHistoryDetailKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, paymentIntentHistoryDetailKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PaymentIntentHistoryDetailKey getArgs(PaymentIntentHistoryDetailFragment paymentIntentHistoryDetailFragment) {
            return (PaymentIntentHistoryDetailKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, paymentIntentHistoryDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PaymentIntentHistoryDetailFragment newInstance(PaymentIntentHistoryDetailKey paymentIntentHistoryDetailKey) {
            return (PaymentIntentHistoryDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, paymentIntentHistoryDetailKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PaymentIntentHistoryDetailFragment paymentIntentHistoryDetailFragment, PaymentIntentHistoryDetailKey paymentIntentHistoryDetailKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, paymentIntentHistoryDetailFragment, paymentIntentHistoryDetailKey);
        }
    }
}
