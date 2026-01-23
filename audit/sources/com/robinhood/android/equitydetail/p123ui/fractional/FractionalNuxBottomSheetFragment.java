package com.robinhood.android.equitydetail.p123ui.fractional;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.EquityDetailNuxStore;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FractionalNuxBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0012H\u0014J\b\u0010-\u001a\u00020\u0012H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\rR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010$¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/fractional/FractionalNuxBottomSheetFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "<init>", "()V", "equityDetailNuxStore", "Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;", "getEquityDetailNuxStore", "()Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;", "setEquityDetailNuxStore", "(Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;)V", "titleTextLabel", "", "getTitleTextLabel", "()Ljava/lang/String;", "descriptionTextLabel", "getDescriptionTextLabel", "descriptionLearnMoreAction", "Lkotlin/Function0;", "", "getDescriptionLearnMoreAction", "()Lkotlin/jvm/functions/Function0;", "primaryButtonLabel", "getPrimaryButtonLabel", "secondaryButtonLabel", "getSecondaryButtonLabel", "showLearnMore", "", "getShowLearnMore", "()Ljava/lang/Boolean;", "symbol", "getSymbol", "symbol$delegate", "Lkotlin/Lazy;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "instrumentId$delegate", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FractionalNuxBottomSheetFragment extends RhBottomSheetDialogFragment {
    private static final String ARG_INSTRUMENT_ID = "instrumentId";
    private static final String ARG_SYMBOL = "symbol";
    public EquityDetailNuxStore equityDetailNuxStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final Function0<Unit> descriptionLearnMoreAction = new Function0() { // from class: com.robinhood.android.equitydetail.ui.fractional.FractionalNuxBottomSheetFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FractionalNuxBottomSheetFragment.descriptionLearnMoreAction$lambda$0(this.f$0);
        }
    };

    /* renamed from: symbol$delegate, reason: from kotlin metadata */
    private final Lazy symbol = Fragments2.argument(this, "symbol");

    /* renamed from: instrumentId$delegate, reason: from kotlin metadata */
    private final Lazy instrumentId = Fragments2.argument(this, "instrumentId");

    /* compiled from: FractionalNuxBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final EquityDetailNuxStore getEquityDetailNuxStore() {
        EquityDetailNuxStore equityDetailNuxStore = this.equityDetailNuxStore;
        if (equityDetailNuxStore != null) {
            return equityDetailNuxStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("equityDetailNuxStore");
        return null;
    }

    public final void setEquityDetailNuxStore(EquityDetailNuxStore equityDetailNuxStore) {
        Intrinsics.checkNotNullParameter(equityDetailNuxStore, "<set-?>");
        this.equityDetailNuxStore = equityDetailNuxStore;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getTitleTextLabel() throws Resources.NotFoundException {
        String string2 = getResources().getString(C15314R.string.fractional_nux_title, getSymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getDescriptionTextLabel() throws Resources.NotFoundException {
        String string2 = getResources().getString(C15314R.string.fractional_nux_description, getSymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected Function0<Unit> getDescriptionLearnMoreAction() {
        return this.descriptionLearnMoreAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptionLearnMoreAction$lambda$0(FractionalNuxBottomSheetFragment fractionalNuxBottomSheetFragment) throws Resources.NotFoundException {
        String string2 = fractionalNuxBottomSheetFragment.getResources().getString(C15314R.string.fractional_nux_learn_more_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigator navigator = fractionalNuxBottomSheetFragment.getNavigator();
        Context contextRequireContext = fractionalNuxBottomSheetFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
        fractionalNuxBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getPrimaryButtonLabel() throws Resources.NotFoundException {
        String string2 = getResources().getString(C15314R.string.fractional_nux_cta, getSymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getSecondaryButtonLabel() throws Resources.NotFoundException {
        String string2 = getResources().getString(C11048R.string.general_label_dismiss);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected Boolean getShowLearnMore() {
        return Boolean.TRUE;
    }

    private final String getSymbol() {
        return (String) this.symbol.getValue();
    }

    private final UUID getInstrumentId() {
        return (UUID) this.instrumentId.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getEquityDetailNuxStore().markEquityDetailNuxShown();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(Fragments2.getBaseActivity(this).getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.fractional.FractionalNuxBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FractionalNuxBottomSheetFragment.onResume$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(FractionalNuxBottomSheetFragment fractionalNuxBottomSheetFragment, DayNightOverlay dayNightOverlay) {
        int i;
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        Context contextRequireContext = fractionalNuxBottomSheetFragment.requireContext();
        if (WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()] == 1) {
            i = C11048R.drawable.svg_dollars_order_day;
        } else {
            i = C11048R.drawable.svg_dollars_order_night;
        }
        fractionalNuxBottomSheetFragment.setIconDrawable(contextRequireContext.getDrawable(i));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onPrimaryButtonClicked() {
        dismiss();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new EquityOrderActivityIntentKey.WithId(getInstrumentId(), EquityOrderSide.BUY, EquityOrderFlowSource.FRACTIONAL_NUX_BOTTOM_SHEET, null, null, null, null, false, false, 504, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onSecondaryButtonClicked() {
        dismiss();
    }

    /* compiled from: FractionalNuxBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/fractional/FractionalNuxBottomSheetFragment$Companion;", "", "<init>", "()V", "ARG_SYMBOL", "", "ARG_INSTRUMENT_ID", "newInstance", "Lcom/robinhood/android/equitydetail/ui/fractional/FractionalNuxBottomSheetFragment;", "symbol", "instrumentId", "Ljava/util/UUID;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FractionalNuxBottomSheetFragment newInstance(String symbol, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            FractionalNuxBottomSheetFragment fractionalNuxBottomSheetFragment = new FractionalNuxBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putSerializable("instrumentId", instrumentId);
            fractionalNuxBottomSheetFragment.setArguments(bundle);
            return fractionalNuxBottomSheetFragment;
        }
    }
}
