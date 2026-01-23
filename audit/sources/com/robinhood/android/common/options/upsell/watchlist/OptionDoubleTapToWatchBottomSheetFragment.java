package com.robinhood.android.common.options.upsell.watchlist;

import android.content.Context;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionDoubleTapToWatchBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010 \u001a\u00020\u0018H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u0018X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/watchlist/OptionDoubleTapToWatchBottomSheetFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "getOptionsWatchlistStore", "()Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "setOptionsWatchlistStore", "(Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;)V", "iconDrawableRes", "", "getIconDrawableRes", "()Ljava/lang/Integer;", "titleTextLabel", "", "getTitleTextLabel", "()Ljava/lang/String;", "descriptionTextLabel", "getDescriptionTextLabel", "primaryButtonLabel", "getPrimaryButtonLabel", "showLearnMore", "", "getShowLearnMore", "()Ljava/lang/Boolean;", "descriptionLearnMoreAction", "Lkotlin/Function0;", "", "getDescriptionLearnMoreAction", "()Lkotlin/jvm/functions/Function0;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionDoubleTapToWatchBottomSheetFragment extends RhBottomSheetDialogFragment implements RegionGated {
    public OptionsWatchlistStore optionsWatchlistStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    private final boolean showLearnMore = true;
    private final Function0<Unit> descriptionLearnMoreAction = new Function0() { // from class: com.robinhood.android.common.options.upsell.watchlist.OptionDoubleTapToWatchBottomSheetFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OptionDoubleTapToWatchBottomSheetFragment.descriptionLearnMoreAction$lambda$0(this.f$0);
        }
    };

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final OptionsWatchlistStore getOptionsWatchlistStore() {
        OptionsWatchlistStore optionsWatchlistStore = this.optionsWatchlistStore;
        if (optionsWatchlistStore != null) {
            return optionsWatchlistStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionsWatchlistStore");
        return null;
    }

    public final void setOptionsWatchlistStore(OptionsWatchlistStore optionsWatchlistStore) {
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "<set-?>");
        this.optionsWatchlistStore = optionsWatchlistStore;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected Integer getIconDrawableRes() {
        return Integer.valueOf(C11303R.drawable.svg_ic_tap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getTitleTextLabel() {
        String string2 = getString(C11303R.string.double_tap_to_watchlist_bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getDescriptionTextLabel() {
        String string2 = getString(C11303R.string.double_tap_to_watchlist_bottom_sheet_body);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getPrimaryButtonLabel() {
        String string2 = getString(C11048R.string.general_label_done);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected Boolean getShowLearnMore() {
        return Boolean.valueOf(this.showLearnMore);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected Function0<Unit> getDescriptionLearnMoreAction() {
        return this.descriptionLearnMoreAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptionLearnMoreAction$lambda$0(OptionDoubleTapToWatchBottomSheetFragment optionDoubleTapToWatchBottomSheetFragment) {
        Navigator navigator = optionDoubleTapToWatchBottomSheetFragment.getNavigator();
        Context contextRequireContext = optionDoubleTapToWatchBottomSheetFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.OptionsWatchlistOnboarding(OptionWatchlistAboutContext.SourceType.DOUBLE_TAP_BOTTOM_SHEET), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionDoubleTapToWatchBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/watchlist/OptionDoubleTapToWatchBottomSheetFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/common/options/upsell/watchlist/OptionDoubleTapToWatchBottomSheetFragment;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionDoubleTapToWatchBottomSheetFragment newInstance() {
            return new OptionDoubleTapToWatchBottomSheetFragment();
        }
    }
}
