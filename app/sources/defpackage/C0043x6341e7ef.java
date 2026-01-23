package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.C8825R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.LinkingOptionsIntentKey;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$2$1$4 */
/* loaded from: classes24.dex */
final class C0043x6341e7ef implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;

    C0043x6341e7ef(Navigator navigator, Context context) {
        this.$navigator = navigator;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-378868507, i, -1, "TransferAccountList.<anonymous>.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:580)");
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BUBBLE_PLUS_24, null, null, 6, null), StringResources_androidKt.stringResource(C8825R.string.advisory_first_deposit_transfer_account_list_add_account, composer, 0), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$2$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C0043x6341e7ef.invoke$lambda$1$lambda$0(navigator, context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, true, false, false, 0L, (Function0) objRememberedValue, composer, (BentoBaseRowState.$stable << 3) | 384, 57);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new LinkingOptionsIntentKey(PaymentLinkingContext.EntryPoint.USER_SIGN_UP, false, 2, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }
}
