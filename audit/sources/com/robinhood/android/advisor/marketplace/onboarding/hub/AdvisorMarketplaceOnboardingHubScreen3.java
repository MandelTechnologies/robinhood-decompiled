package com.robinhood.android.advisor.marketplace.onboarding.hub;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisorMarketplaceOnboardingHubScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$1$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisorMarketplaceOnboardingHubScreen3 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<MeetingsHub> $activeMeetingsFilter$delegate;
    final /* synthetic */ AdvisorMarketplaceOnboardingHubViewState.Loaded $state;

    AdvisorMarketplaceOnboardingHubScreen3(AdvisorMarketplaceOnboardingHubViewState.Loaded loaded, SnapshotState<MeetingsHub> snapshotState) {
        this.$state = loaded;
        this.$activeMeetingsFilter$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-901157052, i, -1, "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubLoadedScreen.<anonymous>.<anonymous>.<anonymous> (AdvisorMarketplaceOnboardingHubScreen.kt:214)");
        }
        MeetingsHub meetingsHubAdvisorMarketplaceOnboardingHubLoadedScreen$lambda$20 = AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$20(this.$activeMeetingsFilter$delegate);
        boolean z = !this.$state.getMeetingsHubResponse().getUpcomingMeetings().isEmpty();
        boolean z2 = !this.$state.getMeetingsHubResponse().getPastMeetings().isEmpty();
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$activeMeetingsFilter$delegate);
        final SnapshotState<MeetingsHub> snapshotState = this.$activeMeetingsFilter$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvisorMarketplaceOnboardingHubScreen3.invoke$lambda$1$lambda$0(snapshotState, (MeetingsHub) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        MeetingsHub2.MeetingsFilterGroup(meetingsHubAdvisorMarketplaceOnboardingHubLoadedScreen$lambda$20, z, z2, (Function1) objRememberedValue, null, composer, 0, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, MeetingsHub filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        snapshotState.setValue(filter);
        return Unit.INSTANCE;
    }
}
