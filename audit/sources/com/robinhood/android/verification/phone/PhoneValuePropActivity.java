package com.robinhood.android.verification.phone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.BaseSheetActivity;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.verification.C31368R;
import com.robinhood.android.verification.LocalityStringResources;
import com.robinhood.android.verification.databinding.ActivityPhoneValuePropBinding;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.onboarding.contracts.PhoneValueProp;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PhoneValuePropActivity.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneValuePropActivity;", "Lcom/robinhood/android/common/ui/BaseSheetActivity;", "<init>", "()V", "localityStringResources", "Lcom/robinhood/android/verification/LocalityStringResources;", "getLocalityStringResources", "()Lcom/robinhood/android/verification/LocalityStringResources;", "setLocalityStringResources", "(Lcom/robinhood/android/verification/LocalityStringResources;)V", "binding", "Lcom/robinhood/android/verification/databinding/ActivityPhoneValuePropBinding;", "getBinding", "()Lcom/robinhood/android/verification/databinding/ActivityPhoneValuePropBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "shouldPromptForLockscreen", "", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PhoneValuePropActivity extends BaseSheetActivity {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public LocalityStringResources localityStringResources;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PhoneValuePropActivity.class, "binding", "getBinding()Lcom/robinhood/android/verification/databinding/ActivityPhoneValuePropBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    public PhoneValuePropActivity() {
        super(C31368R.layout.activity_phone_value_prop);
        this.binding = ViewBinding5.viewBinding(this, PhoneValuePropActivity2.INSTANCE);
    }

    public final LocalityStringResources getLocalityStringResources() {
        LocalityStringResources localityStringResources = this.localityStringResources;
        if (localityStringResources != null) {
            return localityStringResources;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localityStringResources");
        return null;
    }

    public final void setLocalityStringResources(LocalityStringResources localityStringResources) {
        Intrinsics.checkNotNullParameter(localityStringResources, "<set-?>");
        this.localityStringResources = localityStringResources;
    }

    private final ActivityPhoneValuePropBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityPhoneValuePropBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseSheetActivity, com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseSheetActivity, com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        LottieUrl lottieUrl;
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        boolean z = ((PhoneValueProp) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK;
        if (z) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        if (((PhoneValueProp) companion.getExtras((Activity) this)).getTheme() != ColorTheme.DEFAULT) {
            AppCompatImageView phoneStaticHeader = getBinding().phoneStaticHeader;
            Intrinsics.checkNotNullExpressionValue(phoneStaticHeader, "phoneStaticHeader");
            phoneStaticHeader.setVisibility(8);
            LottieAnimationView phoneAnimatedHeader = getBinding().phoneAnimatedHeader;
            Intrinsics.checkNotNullExpressionValue(phoneAnimatedHeader, "phoneAnimatedHeader");
            if (!DayNightChanges.isDay(ScarletManager2.getScarletManager(this)) || z) {
                lottieUrl = LottieUrl.BRAND_REFRESH_PHONE_VERIFY_DARK;
            } else {
                lottieUrl = LottieUrl.BRAND_REFRESH_PHONE_VERIFY_LIGHT;
            }
            LottieAnimationViewsKt.setRemoteUrl(phoneAnimatedHeader, lottieUrl);
            LottieAnimationView phoneAnimatedHeader2 = getBinding().phoneAnimatedHeader;
            Intrinsics.checkNotNullExpressionValue(phoneAnimatedHeader2, "phoneAnimatedHeader");
            phoneAnimatedHeader2.setVisibility(0);
        }
        getBinding().phoneValuePropSubtitle.setText(getLocalityStringResources().getPhone_value_prop_subtitle());
        getBinding().phoneValuePropOne.setPrimaryText(getLocalityStringResources().getPhone_value_prop_one_primary());
        getBinding().phoneValuePropOne.setSecondaryText(getLocalityStringResources().getPhone_value_prop_one_secondary());
        getBinding().phoneValuePropTwo.setSecondaryText(getLocalityStringResources().getPhone_value_prop_two_secondary());
    }

    /* compiled from: PhoneValuePropActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneValuePropActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/verification/phone/PhoneValuePropActivity;", "Lcom/robinhood/shared/onboarding/contracts/PhoneValueProp;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PhoneValuePropActivity, PhoneValueProp> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PhoneValueProp getExtras(PhoneValuePropActivity phoneValuePropActivity) {
            return (PhoneValueProp) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, phoneValuePropActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PhoneValueProp phoneValueProp) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, phoneValueProp);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PhoneValueProp phoneValueProp) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, phoneValueProp);
        }
    }
}
