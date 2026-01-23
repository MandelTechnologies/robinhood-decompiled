package com.robinhood.android.jointaccounts.onboarding.confirmation;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryViewState;
import com.robinhood.models.jointaccounts.api.confirmation.ApiConfirmSecondaryViewModel;
import com.robinhood.models.serverdriven.experimental.api.DataRowCondensed;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: JointAccountConfirmSecondaryScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryViewStateParameterProvider, reason: use source file name */
/* loaded from: classes10.dex */
final class JointAccountConfirmSecondaryScreen7 implements PreviewParameterProvider<JointAccountConfirmSecondaryViewState> {
    private final Sequence<JointAccountConfirmSecondaryViewState> values = SequencesKt.plus(SequencesKt.sequenceOf(JointAccountConfirmSecondaryViewState.Loading.INSTANCE, JointAccountConfirmSecondaryViewState.Error.INSTANCE), SequencesKt.map(SequencesKt.sequenceOf(Boolean.FALSE, Boolean.TRUE), new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryViewStateParameterProvider$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return JointAccountConfirmSecondaryScreen7.values$lambda$0(((Boolean) obj).booleanValue());
        }
    }));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<JointAccountConfirmSecondaryViewState> getValues() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JointAccountConfirmSecondaryViewState.Loaded values$lambda$0(boolean z) {
        return new JointAccountConfirmSecondaryViewState.Loaded(new ApiConfirmSecondaryViewModel("123456", "Open a joint account with Mr. Potatohead", "Once you confirm their info, your joint account will be ready.", CollectionsKt.listOf(new DataRowCondensed("Name", null, "Jesse Pinkman", 2, null)), "Yes, open account", AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_CONFIRM, "No, invite someone else", "reject", new ApiConfirmSecondaryViewModel.RejectAlert("Are you sure you want to delete your joint account application?", "Now you can start a new application and invite a new co-owner", "Confirm", "finalize_rejection", "Go back", "cancel_rejection")), z, "idk");
    }
}
