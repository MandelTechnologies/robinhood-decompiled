package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.drip.contracts.DripSettings;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.utils.extensions.ObservablesAndroid;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DripHistoryUpsellBottomSheet.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010!\u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0014J\b\u0010#\u001a\u00020\u0016H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DripHistoryUpsellBottomSheet;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "<init>", "()V", "dripSettingsStore", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "getDripSettingsStore", "()Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "setDripSettingsStore", "(Lcom/robinhood/librobinhood/data/store/DripSettingsStore;)V", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "accountNumber$delegate", "Lkotlin/Lazy;", "titleTextLabel", "getTitleTextLabel", "descriptionTextLabel", "getDescriptionTextLabel", "descriptionLearnMoreAction", "Lkotlin/Function0;", "", "getDescriptionLearnMoreAction", "()Lkotlin/jvm/functions/Function0;", "primaryButtonLabel", "getPrimaryButtonLabel", "secondaryButtonLabel", "getSecondaryButtonLabel", "showLearnMore", "", "getShowLearnMore", "()Ljava/lang/Boolean;", "onResume", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DripHistoryUpsellBottomSheet extends RhBottomSheetDialogFragment {
    public static final String ACCOUNT_NUMBER_KEY = "accountNumber";

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber = Fragments2.argument(this, "accountNumber");
    private final Function0<Unit> descriptionLearnMoreAction = new Function0() { // from class: com.robinhood.android.history.ui.DripHistoryUpsellBottomSheet$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DripHistoryUpsellBottomSheet.descriptionLearnMoreAction$lambda$0(this.f$0);
        }
    };
    public DripSettingsStore dripSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DripHistoryUpsellBottomSheet.kt */
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

    public final DripSettingsStore getDripSettingsStore() {
        DripSettingsStore dripSettingsStore = this.dripSettingsStore;
        if (dripSettingsStore != null) {
            return dripSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dripSettingsStore");
        return null;
    }

    public final void setDripSettingsStore(DripSettingsStore dripSettingsStore) {
        Intrinsics.checkNotNullParameter(dripSettingsStore, "<set-?>");
        this.dripSettingsStore = dripSettingsStore;
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getTitleTextLabel() {
        String string2 = getString(C18359R.string.drip_history_upsell_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getDescriptionTextLabel() {
        String string2 = getString(C18359R.string.drip_history_upsell_description);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected Function0<Unit> getDescriptionLearnMoreAction() {
        return this.descriptionLearnMoreAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptionLearnMoreAction$lambda$0(DripHistoryUpsellBottomSheet dripHistoryUpsellBottomSheet) {
        WebUtils.viewUrl$default(dripHistoryUpsellBottomSheet.getContext(), dripHistoryUpsellBottomSheet.getResources().getString(C18359R.string.drip_history_learn_article_url), 0, 4, (Object) null);
        dripHistoryUpsellBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getPrimaryButtonLabel() {
        String string2 = getString(C18359R.string.drip_history_upsell_positive_button);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getSecondaryButtonLabel() {
        String string2 = getString(C11048R.string.general_label_not_now);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected Boolean getShowLearnMore() {
        return Boolean.TRUE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(Fragments2.getBaseActivity(this).getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.DripHistoryUpsellBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DripHistoryUpsellBottomSheet.onResume$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(DripHistoryUpsellBottomSheet dripHistoryUpsellBottomSheet, DayNightOverlay dayNightOverlay) {
        int i;
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        Context contextRequireContext = dripHistoryUpsellBottomSheet.requireContext();
        if (WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()] == 1) {
            i = C18359R.drawable.ic_drip_upsell_icon_day;
        } else {
            i = C18359R.drawable.ic_drip_upsell_icon_night;
        }
        dripHistoryUpsellBottomSheet.setIconDrawable(contextRequireContext.getDrawable(i));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onPrimaryButtonClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new DripSettings(getAccountNumber()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        getDripSettingsStore().markDripHistoryUpsellShown(getAccountNumber());
        dismiss();
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onSecondaryButtonClicked() {
        getDripSettingsStore().markDripHistoryUpsellShown(getAccountNumber());
        dismiss();
    }

    /* compiled from: DripHistoryUpsellBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DripHistoryUpsellBottomSheet$Companion;", "", "<init>", "()V", "ACCOUNT_NUMBER_KEY", "", "newInstance", "Lcom/robinhood/android/history/ui/DripHistoryUpsellBottomSheet;", "accountNumber", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DripHistoryUpsellBottomSheet newInstance(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            DripHistoryUpsellBottomSheet dripHistoryUpsellBottomSheet = new DripHistoryUpsellBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putString("accountNumber", accountNumber);
            dripHistoryUpsellBottomSheet.setArguments(bundle);
            return dripHistoryUpsellBottomSheet;
        }
    }
}
