package com.robinhood.android.advisor.marketplace.onboarding.hub;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisorMarketplaceOnboardingHubScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisorMarketplaceOnboardingHubScreen2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<AdvisorMarketplaceOnboardingHubScreen6> $activeHub$delegate;

    /* compiled from: AdvisorMarketplaceOnboardingHubScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$1$1$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvisorMarketplaceOnboardingHubScreen6.values().length];
            try {
                iArr[AdvisorMarketplaceOnboardingHubScreen6.MATCHES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvisorMarketplaceOnboardingHubScreen6.MEETINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    AdvisorMarketplaceOnboardingHubScreen2(SnapshotState<AdvisorMarketplaceOnboardingHubScreen6> snapshotState) {
        this.$activeHub$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-1005054132, i, -1, "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubLoadedScreen.<anonymous>.<anonymous>.<anonymous> (AdvisorMarketplaceOnboardingHubScreen.kt:200)");
        }
        AdvisorMarketplaceOnboardingHubScreen6 advisorMarketplaceOnboardingHubScreen6AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$16 = AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$16(this.$activeHub$delegate);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$activeHub$delegate);
        final SnapshotState<AdvisorMarketplaceOnboardingHubScreen6> snapshotState = this.$activeHub$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreenKt$AdvisorMarketplaceOnboardingHubLoadedScreen$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvisorMarketplaceOnboardingHubScreen2.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AdvisorMarketplaceOnboardingHubScreen.HubHeader(advisorMarketplaceOnboardingHubScreen6AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$16, (Function0) objRememberedValue, null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        AdvisorMarketplaceOnboardingHubScreen6 advisorMarketplaceOnboardingHubScreen6;
        int i = WhenMappings.$EnumSwitchMapping$0[AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubLoadedScreen$lambda$16(snapshotState).ordinal()];
        if (i == 1) {
            advisorMarketplaceOnboardingHubScreen6 = AdvisorMarketplaceOnboardingHubScreen6.MEETINGS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            advisorMarketplaceOnboardingHubScreen6 = AdvisorMarketplaceOnboardingHubScreen6.MATCHES;
        }
        snapshotState.setValue(advisorMarketplaceOnboardingHubScreen6);
        return Unit.INSTANCE;
    }
}
