package com.robinhood.android.transfers;

import android.os.Parcelable;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.transfers.DebitCardBottomSheetFragment;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: TransfersHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.TransfersHubFragment$bindDebitCardSection$1$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class TransfersHubFragment4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TransfersHubViewState $state;
    final /* synthetic */ ComposeView $this_with;
    final /* synthetic */ TransfersHubFragment this$0;

    TransfersHubFragment4(TransfersHubViewState transfersHubViewState, ComposeView composeView, TransfersHubFragment transfersHubFragment) {
        this.$state = transfersHubViewState;
        this.$this_with = composeView;
        this.this$0 = transfersHubFragment;
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
            ComposerKt.traceEventStart(-349946917, i, -1, "com.robinhood.android.transfers.TransfersHubFragment.bindDebitCardSection.<anonymous>.<anonymous>.<anonymous> (TransfersHubFragment.kt:492)");
        }
        ImmutableList<ApiPaymentInstrument> activeDebitCardInstruments = this.$state.getActiveDebitCardInstruments();
        ComposeView composeView = this.$this_with;
        Intrinsics.checkNotNull(composeView);
        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(composeView));
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final TransfersHubFragment transfersHubFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.TransfersHubFragment$bindDebitCardSection$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransfersHubFragment4.invoke$lambda$1$lambda$0(transfersHubFragment, (ApiPaymentInstrument) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        DebitCardsComposable.DebitCardsComposable(activeDebitCardInstruments, observableThemeChangesForCompose, (Function1) objRememberedValue, null, composer, 0, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TransfersHubFragment transfersHubFragment, ApiPaymentInstrument debitCardInstrument) {
        Intrinsics.checkNotNullParameter(debitCardInstrument, "debitCardInstrument");
        DebitCardBottomSheetFragment debitCardBottomSheetFragment = (DebitCardBottomSheetFragment) DebitCardBottomSheetFragment.INSTANCE.newInstance((Parcelable) new DebitCardBottomSheetFragment.Args(debitCardInstrument.getInstrument_id()));
        FragmentManager parentFragmentManager = transfersHubFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        debitCardBottomSheetFragment.show(parentFragmentManager, "debit-card-bottom-sheet");
        return Unit.INSTANCE;
    }
}
