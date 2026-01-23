package com.robinhood.android.address.p062ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.address.p062ui.AddressParentFragment;
import com.robinhood.android.address.p062ui.extensions.ChooseAddressSources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressResult;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p355ui.identi.PartialAddress;
import com.robinhood.models.p355ui.identi.PartialGbAddress;
import com.robinhood.models.p355ui.identi.PartialUsAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.Activity;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChooseAddressActivity.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/address/ui/ChooseAddressActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/address/ui/AddressParentFragment$Callback;", "<init>", "()V", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "source$delegate", "Lkotlin/Lazy;", ChooseAddressActivity.EXTRA_USE_MONOCHROME, "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "shouldPromptForLockscreen", "onAddressVerified", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "Companion", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class ChooseAddressActivity extends BaseActivity implements AddressParentFragment.Callback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_ADDRESS = "rhAddress";
    private static final String EXTRA_COUNTRY_CODE = "countryCode";
    private static final String EXTRA_FORCE_MANUAL_ENTRY = "forceManualEntry";
    private static final String EXTRA_SOURCE = "rhSource";
    private static final String EXTRA_USE_MONOCHROME = "useMonochrome";

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;
    private boolean useMonochrome;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    public ChooseAddressActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.source = Activity.intentExtra(this, EXTRA_SOURCE);
    }

    private final ChooseAddressSource getSource() {
        return (ChooseAddressSource) this.source.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object serializableExtra;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 34) {
                serializableExtra = intent.getSerializableExtra(EXTRA_COUNTRY_CODE, CountryCode.Supported.class);
            } else {
                Serializable serializableExtra2 = intent.getSerializableExtra(EXTRA_COUNTRY_CODE);
                if (!(serializableExtra2 instanceof CountryCode.Supported)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (CountryCode.Supported) serializableExtra2;
            }
            Intrinsics.checkNotNull(serializableExtra);
            boolean booleanExtra = getIntent().getBooleanExtra(EXTRA_FORCE_MANUAL_ENTRY, false);
            Parcelable parcelableExtra = getIntent().getParcelableExtra(EXTRA_ADDRESS);
            Intrinsics.checkNotNull(parcelableExtra);
            this.useMonochrome = getIntent().getBooleanExtra(EXTRA_USE_MONOCHROME, false);
            setFragment(C11048R.id.fragment_container, AddressParentFragment.INSTANCE.newInstance(getSource(), (CountryCode.Supported) serializableExtra, booleanExtra, (PartialAddress) parcelableExtra));
        }
        if (this.useMonochrome) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AddressMonochromeOverlay.INSTANCE, null, 2, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.useMonochrome) {
            ScarletManager.removeOverlay$default(ScarletManager2.getScarletManager(this), AddressMonochromeOverlay.INSTANCE.getPriority(), null, 2, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return ChooseAddressSources.getTag(getSource());
    }

    @Override // com.robinhood.android.address.ui.AddressParentFragment.Callback
    public void onAddressVerified(ChooseAddressSource source, UiAddress address) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(address, "address");
        ChooseAddressResult chooseAddressResult = new ChooseAddressResult(source, address);
        Intent intent = new Intent();
        intent.putExtra(ChooseAddressResult.EXTRA_ADDRESS_RESULT, chooseAddressResult);
        setResult(-1, intent);
        finish();
    }

    /* compiled from: ChooseAddressActivity.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J6\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/address/ui/ChooseAddressActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChooseAddress;", "<init>", "()V", "EXTRA_FORCE_MANUAL_ENTRY", "", "EXTRA_COUNTRY_CODE", "EXTRA_SOURCE", "EXTRA_ADDRESS", "EXTRA_USE_MONOCHROME", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", ChooseAddressActivity.EXTRA_COUNTRY_CODE, "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", ChooseAddressActivity.EXTRA_FORCE_MANUAL_ENTRY, "", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/PartialAddress;", ChooseAddressActivity.EXTRA_USE_MONOCHROME, "getIntent", "key", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.ChooseAddress> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getStartIntent(Context context, ChooseAddressSource source, CountryCode.Supported countryCode, boolean forceManualEntry, PartialAddress address, boolean useMonochrome) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(address, "address");
            Intent intent = new Intent(context, (Class<?>) ChooseAddressActivity.class);
            intent.putExtra(ChooseAddressActivity.EXTRA_SOURCE, source);
            intent.putExtra(ChooseAddressActivity.EXTRA_COUNTRY_CODE, countryCode);
            intent.putExtra(ChooseAddressActivity.EXTRA_FORCE_MANUAL_ENTRY, forceManualEntry);
            intent.putExtra(ChooseAddressActivity.EXTRA_ADDRESS, address);
            intent.putExtra(ChooseAddressActivity.EXTRA_USE_MONOCHROME, useMonochrome);
            return intent;
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.ChooseAddress key) {
            PartialAddress partialGbAddress;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            CountryCode.Supported countryCode = key.getCountryCode();
            if (Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedStates.INSTANCE)) {
                partialGbAddress = new PartialUsAddress(null, null, null, null, null, 31, null);
            } else {
                if (!Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    if (!Intrinsics.areEqual(countryCode, CountryCode.Supported.Austria.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Belgium.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Bulgaria.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Croatia.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Cyprus.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Czechia.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Denmark.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Estonia.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Finland.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.France.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Germany.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Greece.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Hungary.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Iceland.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Ireland.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Italy.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Latvia.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Liechtenstein.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Lithuania.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Luxembourg.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Malta.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Norway.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Netherlands.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Poland.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Portugal.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Romania.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Slovakia.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Slovenia.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Spain.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Sweden.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Singapore.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.HongKongSARChina.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Indonesia.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Malaysia.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Taiwan.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Thailand.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.Vietnam.INSTANCE) && !Intrinsics.areEqual(countryCode, CountryCode.Supported.India.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException((key.getCountryCode().getIso3166CountryCode() + " addresses are unsupported").toString());
                }
                partialGbAddress = new PartialGbAddress(null, null, null, null, 15, null);
            }
            PartialAddress partialAddress = key.getPartialAddress();
            PartialAddress partialAddress2 = partialAddress == null ? partialGbAddress : partialAddress;
            Boolean forceManualEntry = key.getForceManualEntry();
            return getStartIntent(context, key.getSource(), key.getCountryCode(), forceManualEntry != null ? forceManualEntry.booleanValue() : false, partialAddress2, key.getUseMonochrome());
        }
    }
}
