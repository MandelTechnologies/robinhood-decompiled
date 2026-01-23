package com.robinhood.android.address.p062ui;

import android.content.res.Resources;
import androidx.view.result.ActivityResultCaller;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.address.lib.p061ui.ManualAddressReason;
import com.robinhood.android.address.p062ui.extensions.ChooseAddressSources;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p355ui.identi.PartialAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseChooseAddressFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/address/ui/BaseChooseAddressFragment;", "Lcom/robinhood/android/address/ui/AbstractAddressFragment;", "layoutRes", "", "<init>", "(I)V", "()V", "callback", "Lcom/robinhood/android/address/ui/BaseChooseAddressFragment$Callback;", "getCallback", "()Lcom/robinhood/android/address/ui/BaseChooseAddressFragment$Callback;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "logError", "t", "", "Callback", "ChooseAddressFailedException", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class BaseChooseAddressFragment extends AbstractAddressFragment {

    /* compiled from: BaseChooseAddressFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/address/ui/BaseChooseAddressFragment$Callback;", "", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "onAddressSelected", "", "placeId", "", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "onAddressVerified", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "onManualAddressInputSelected", "reason", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason;", "partialAddress", "Lcom/robinhood/models/ui/identi/PartialAddress;", "onManualAddressVerified", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        CountryCode.Supported getCountryCode();

        ChooseAddressSource getSource();

        void onAddressSelected(String placeId, AutocompleteSessionToken sessionToken);

        void onAddressVerified(UiAddress address);

        void onManualAddressInputSelected(ManualAddressReason reason, PartialAddress partialAddress);

        void onManualAddressVerified(PartialAddress partialAddress);
    }

    public BaseChooseAddressFragment(int i) {
        super(i);
    }

    public BaseChooseAddressFragment() {
        this(0);
    }

    public final Callback getCallback() {
        ActivityResultCaller parentFragment = getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.robinhood.android.address.ui.BaseChooseAddressFragment.Callback");
        return (Callback) parentFragment;
    }

    @Override // com.robinhood.android.address.p062ui.AbstractAddressFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(ChooseAddressSources.getTitleRes(getCallback().getSource()));
        if (getParentFragmentManager().getBackStackEntryCount() == 0) {
            requireBaseActivity().showCloseIcon();
        } else {
            requireBaseActivity().showBackArrowIcon();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return getCallback().getCountryCode().getIso3166CountryCode() + PlaceholderUtils.XXShortPlaceholderText + ChooseAddressSources.getTag(getCallback().getSource());
    }

    @Override // com.robinhood.android.address.p062ui.AbstractAddressFragment
    public void logError(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new ChooseAddressFailedException(t), false, null, 6, null);
    }

    /* compiled from: BaseChooseAddressFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/address/ui/BaseChooseAddressFragment$ChooseAddressFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ChooseAddressFailedException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChooseAddressFailedException(Throwable throwable) {
            super(throwable);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }
    }
}
