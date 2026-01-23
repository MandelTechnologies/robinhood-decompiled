package com.robinhood.android.jointaccounts.onboarding.intro.primary;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset;
import com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroViewState;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: JointAccountOnboardingPrimaryUserIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class JointAccountPrimaryIntroViewStateParameterProvider implements PreviewParameterProvider<JointAccountPrimaryIntroViewState> {
    private final Sequence<JointAccountPrimaryIntroViewState> values = SequencesKt.sequenceOf(JointAccountPrimaryIntroViewState.Loading.INSTANCE, JointAccountPrimaryIntroViewState.Error.INSTANCE, new JointAccountPrimaryIntroViewState.Loaded(JointAccountOnboardingAsset.Fullscreen.PrimaryIntroVariant2.INSTANCE, "https://127.0.0.1/", extensions2.persistentListOf(), extensions2.persistentListOf(), "Do it", "", "", null));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<JointAccountPrimaryIntroViewState> getValues() {
        return this.values;
    }
}
