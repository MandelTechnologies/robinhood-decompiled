package com.robinhood.android.jointaccounts.onboarding.nux;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.models.jointaccounts.api.confirmation.ApiSecondarySetupViewModel;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: JointAccountSecondarySetupScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/nux/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/nux/SecondarySetupViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes10.dex */
final class JointAccountSecondarySetupScreen3 implements PreviewParameterProvider<AsyncResult<? extends SecondarySetupViewState>> {
    private final Sequence<AsyncResult<SecondarySetupViewState>> values = SequencesKt.sequenceOf(AsyncResult.Loading.INSTANCE, new AsyncResult.Success(new SecondarySetupViewState(new ApiSecondarySetupViewModel("Help your co-owner get set up", "abcdefg", CollectionsKt.emptyList(), new ApiSecondarySetupViewModel.ShareViewModel(Icon.EMAIL_FILLED_24, "Send a reminder", "Join a joint account with me!", "Let's open a joint account", "share_row")), "")));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<AsyncResult<? extends SecondarySetupViewState>> getValues() {
        return this.values;
    }
}
